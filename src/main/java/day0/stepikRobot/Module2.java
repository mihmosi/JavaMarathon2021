package day0.stepikRobot;

    public class Module2 {
        public static void main(String[] args) {
            Robot robot = new Robot(0,0, Direction.DOWN);
            moveRobot(robot, -10, 20);
        }

        public enum Direction {
            UP,
            DOWN,
            LEFT,
            RIGHT
        }

        public static class Robot {
            int x;
            int y;
            Direction dir;

            public Robot (int x, int y, Direction dir) {
                this.x = x;
                this.y = y;
                this.dir = dir;
            }

            public Direction getDirection() {return dir;}

            public int getX() {return x;}

            public int getY() {return y;}

            public void turnLeft() {
                if      (dir == Direction.UP)    {dir = Direction.LEFT;}
                else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
                else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
                else if (dir == Direction.RIGHT) {dir = Direction.UP;}
            }

            public void turnRight() {
                if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
                else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
                else if (dir == Direction.LEFT)  {dir = Direction.UP;}
                else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
            }

            public void stepForward() {
                if (dir == Direction.UP)    {y++;}
                if (dir == Direction.DOWN)  {y--;}
                if (dir == Direction.LEFT)  {x--;}
                if (dir == Direction.RIGHT) {x++;}
            }
        }

        public static void moveRobot(Robot robot, int toX, int toY) {
           if (toX < robot.getX()){
               while(robot.getDirection() != Direction.LEFT){
                   robot.turnRight();
               }
               while (robot.getX() != toX){
                   robot.stepForward();
               }
           } else if (toX > robot.getX()) {
               while (robot.getDirection() != Direction.RIGHT){
                   robot.turnRight();
               }
               while (robot.getX() != toX){
                   robot.stepForward();
               }
           }
           if (toY < robot.getY()) {
               while (robot.getDirection() != Direction.DOWN) {
                   robot.turnLeft();
               }
               while (robot.getY() != toY){
                   robot.stepForward();
               }
           } else  if (toY > robot.getY()) {
               while (robot.getDirection() != Direction.UP){
                   robot.turnLeft();
               }
               while (robot.getY() != toY){
                   robot.stepForward();
               }
           }
        }
    }

