class MenuDemo {
    public static void main(String[] args) {

        int mainMenu = 1;
        int subMenu = 2;

        switch(mainMenu) {

            case 1:
              System.out.println("Veg Menu");

              switch(subMenu) {
                case 1:
                    System.out.println("Idli");
                    break;
                case 2:
                    System.out.println("Dosa");
                    break;
                  default:
                    System.out.println("Invaild veg Item");      
              }
              break;

             case 2:
                System.out.println("Non-Veg Menu");

                switch(subMenu) {
                    case 1:
                    System.out.println("Chicken");
                    break;
                  case 2:
                    System.out.println("Mutton");
                    break;
                } 
                break;

                default:
                    System.out.println("Invaild Menu");
        }
    } 
}