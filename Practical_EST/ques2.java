package EndSemPractical;

class ques2 {

    void init() {
        System.out.println("Servlet initialized");
    }

    void service(String requestType) {

        if (requestType.equals("GET")) {
            System.out.println("Handling GET request");
        } 
        System.out.println("Response sent to client");
    }
    void destroy() {
        System.out.println("Servlet destroyed");
    }

    public static void main(String[] args) {

        ques2 obj = new ques2();

        obj.init();  
        obj.service("GET");

        obj.destroy();
    }
}