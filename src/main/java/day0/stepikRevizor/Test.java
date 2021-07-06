package day0.stepikRevizor;

public class Test {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

//            printTextPerRole(roles, textLines);
        System.out.println(printTextPerRole(roles, textLines));
    }

    static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            sb.append(roles[i] + ":" + '\n');
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    sb.append(textLines[j].replaceFirst(roles[i] + ":", j + 1 + ")") + '\n');
                }
            } sb.append('\n');
        }
        return sb.toString();
    }
}
