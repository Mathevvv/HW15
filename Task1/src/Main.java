public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    public static void main(String[] args) {
        //todo код писать тут
        for (int i = 'А'; i <='Я'; i++) {
            System.out.print((char) (i) + "-" + i + " ");
            System.out.println((char) (i + 32) + "-" + (i + 32));
        }


    }
}