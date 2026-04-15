class SideEffects {
    public static void main(String[] args) {

        int i = 0;

        if(false & (++i < 100))
           System.out.println("Won't print");

        System.out.println(i); // i = 1 condition false but i was executed

        if(false && (++i < 100))
          System.out.println("won't print");

        System.out.println(i); //still 1  because didn't execute this part `&& (++i < 100))`


    }
}