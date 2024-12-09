package ua.ucu.edu.apps.task3;

public class Main {
    public static void main(String[] args) {
        CompanyReaderFacade readerFacade = new CompanyReaderFacade();
        Company company = readerFacade.fetch("ucu.edu.ua");
        System.out.println(company);
    }
}
