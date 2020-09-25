package assignment60problems;
    import java.util.*;
    import javax.swing.*;
    public class Assignment60Problems{
        public static void main(String[] args) {
            number1();
            number2();
            number3();
            number4();
            number5();
            number6();
            number7();
            number8();
            number9();
            number10();    
            number11();
            number12();
            number13();
            number14();
            number15();
            number16();
            number17();
            number18();
            number19();
            number20();
            number21();
            number22();
            number23();
            number24();
            number25();
            number26();
            number27();
            number28();
            number29();
            number30();
            number31();
            number32();
            number33();
            number34();
            number35();
            number36();
            number37();
            number38();
            number39();
            number40();
            number41();
            number42();
            number43();
            number43();
            number44();
            number45();
            number46();
            number47();
            number48();
            number49();
            number50(); 
            number51();
            number52();
            number53();
            number54();
            number55();
            number56();
            number57();
            number58();
            number59();
            number60();
            
        } 
        public static void number1(){
            Scanner input = new Scanner(System.in);
            System.out.print("Do you have a passporte?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can flight abroad");
            } else {
                JOptionPane.showMessageDialog(null, "You can't flight abroad");
            }}
        public static void number2(){ 
            Scanner input = new Scanner(System.in);
            System.out.print("Are you 3 feet or below?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can ride for free");
            } else {
                JOptionPane.showMessageDialog(null, "You can't ride for free");
            }}
        public static void number3(){
            Scanner input = new Scanner(System.in);
            System.out.print("Are you wearing cotton?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can swim in the poool");
            } else {
                JOptionPane.showMessageDialog(null, "You can't swim in the pool");
            }}
        public static void number4(){
            Scanner input = new Scanner(System.in);
            System.out.print("Do you have an ID?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can enter the school");
            } else {
                JOptionPane.showMessageDialog(null, "You can't enter the school");
            }}
        public static void number5(){
            Scanner input = new Scanner(System.in);
            System.out.print("Do you have a mouse or laptop? : ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can pass the computer programming subject");
            } else {
                JOptionPane.showMessageDialog(null, "You can'pass the computer programming subject");
            }}
        public static void number6(){
            Scanner input = new Scanner(System.in);
            System.out.print("Are you exercising?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You have an active life stlye");
            }else {
                JOptionPane.showMessageDialog(null, "You don't have an active life style");
            }}
        public static void number7(){
            Scanner input = new Scanner(System.in);
            System.out.print("Can you hold your breath?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can freedive");
            } else {
                JOptionPane.showMessageDialog(null, "You can't freedive");
            }}
        public static void number8(){
            Scanner input = new Scanner(System.in);
            System.out.print("Are you wearing a glass with grade?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You have a poor eyesight");
            } else {
                JOptionPane.showMessageDialog(null, "You have a normal eyesight");
            }}
        public static void number9(){
            Scanner input = new Scanner(System.in);
            System.out.print("Do you have twenty pesos or above?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can buy Cornetto");
            } else {
                JOptionPane.showMessageDialog(null, "You can't buy Cornetto");
            }}
        public static void number10(){
            Scanner input = new Scanner(System.in);
            System.out.print("Are you have an asthma?: ");
            String x = input.nextLine();
            if (x.equals("yes")) {
                JOptionPane.showMessageDialog(null, "You can't do extreme exercise");
            } else {
                JOptionPane.showMessageDialog(null, "You can do extreme exercise");
            }}
        public static void number11() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many times you want to say I love programming?");
            int a = input.nextInt();
            int counter = 1;
            while (a >= counter){
            {
                JOptionPane.showMessageDialog(null, "I love programming");
                counter++;
            }}}
        public static void number12() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number of Geometric sequece: ");
            int a = input.nextInt();
            System.out.print("Input the factor between two terms: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter){
                JOptionPane.showMessageDialog(null, a);
                a = a * b;
                counter++;
            } 
        }
        public static void number13() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the starting time of your alarm: ");
            int a = input.nextInt();
            System.out.print("Input the hour interval each alarm: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter){
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            } 
        }
        public static void number14() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first number of Arithmetic sequece: ");
            int a = input.nextInt();
            System.out.print("Enter the interval of each number: ");
            int b = input.nextInt();
            System.out.print("How many terms you want to display?: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter) {
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            }
        }
        public static void number15() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input number you want to add in first number: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter) {
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            } 
         }
        public static void number16() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input the the number you want to decrement: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter) {
                JOptionPane.showMessageDialog(null, a);
                a = a - b;
                counter++;
            } 
        }
        public static void number17() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the number of revolution you can do in a minute: ");
            int a = input.nextInt();
            System.out.print("Input the number of minute you can do in a day: ");
            int b = input.nextInt();
            System.out.print("Input the total number of days you can do in doing revolution: ");
            int c = input.nextInt();
            int counter = 1;
            while (c >= counter){
                JOptionPane.showMessageDialog(null, a);
                a = a * b *c;
                counter++;            
            } 
        }
        public static void number18() {
            Scanner input = new Scanner(System.in);
            System.out.println("Christmas Countdown");
            System.out.print("Enter Number:");
            int num = input.nextInt();
            while (num >= 0){
                JOptionPane.showMessageDialog(null, num);
                num--;
            } 
        }
        public static void number19() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your initial floor number: ");
            int a = input.nextInt();
            System.out.print("Enter your destination floor:");
            int b = input.nextInt();
            while (a <= b) {
                JOptionPane.showMessageDialog(null, a);
                a++;
            } 
        }
        public static void number20() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your initial starting point in Marathon");
            int a = input.nextInt();
            System.out.print("Enter the destination distance between starting point to final point:");
            int b = input.nextInt();
            while (a <= b) {
                JOptionPane.showMessageDialog(null, a);
                a++;
            } 
        }
        public static void number21() {
            Scanner input = new Scanner(System.in);
            System.out.println("How many times you want to say I love programming?");
            int a = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, "I love programming");
                counter++;
            } while (a >= counter);
        }
        public static void number22() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number of Geometric sequece: ");
            int a = input.nextInt();
            System.out.print("Input the factor between two terms: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a * b;
                counter++;
            } while (c >= counter);
        }
        public static void number23() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the starting time of your alarm: ");
            int a = input.nextInt();
            System.out.print("Input the hour interval each alarm: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            } while (c >= counter);
        }
        public static void number24() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number of arithmetic sequece: ");
            int a = input.nextInt();
            System.out.print("Input the difference between terms: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            } while (c >= counter);
        }
        public static void number25() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input number you want to add in first number: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a + b;
                counter++;
            } while (c >= counter);
         }
        public static void number26() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number: ");
            int a = input.nextInt();
            System.out.print("Input the the number you want to decrement: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a - b;
                counter++;
            } while (c >= counter);
        }
        public static void number27() {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the number of revolution you can do in a minute: ");
            int a = input.nextInt();
            System.out.print("Input the number of minute you can do in a day: ");
            int b = input.nextInt();
            System.out.print("Input the total number of days you can do in doing revolution: ");
            int c = input.nextInt();
            int counter = 1;
            do {
                JOptionPane.showMessageDialog(null, a);
                a = a * b *c;
                counter++;            
            } while (c >= counter);
        }
        public static void number28() {
            Scanner input = new Scanner(System.in);
            System.out.println("Christmas Countdown");
            System.out.print("Enter Number:");
            int num = input.nextInt();
            do {
                JOptionPane.showMessageDialog(null, num);
                num--;
            } while (num >= 0);
        }
        public static void number29() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your initial floor number: ");
            int a = input.nextInt();
            System.out.print("Enter your destination floor:");
            int b = input.nextInt();
            do {
                JOptionPane.showMessageDialog(null, a);
                a++;
            } while (a <= b);
        }
        public static void number30() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your initial starting point in Marathon");
            int a = input.nextInt();
            System.out.print("Enter the destination distance between starting point to final point:");
            int b = input.nextInt();
            do {
                JOptionPane.showMessageDialog(null, a);
                a++;
            } while (a <= b);
        }
        public static void number31() {
            Scanner insert = new Scanner(System.in);
            System.out.println("Enter the number for countdown");

            for (int i = insert.nextInt(); i >= 1; i--){
                JOptionPane.showMessageDialog(null, i);

            }
        }

        public static void number32() {
            int n, count = 0,a;
            String x = "";
            Scanner s = new Scanner(System.in);
            System.out.println("Enter any number: ");
            for(n = s.nextInt();n>0;count++){
                a = n%2;
                if(a ==1){}
                x=x+""+a;
                n=n/2;
        }
            System.out.println("Binary number is " + x);
    }
    public static void number33 (){
                Scanner insert = new Scanner(System.in);
            System.out.println("Enter the number you want to increment");

            for (int i = insert.nextInt(); i <= 10; i++){
                JOptionPane.showMessageDialog(null, i);

                }
    }
    public static void number34 (){
        Scanner entry = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("How many times you want to display \"Good Morning\"?");
            int a = input.nextInt();
            for( int counter = 1 ;a >= counter; counter++){
            JOptionPane.showMessageDialog(null, "Good Morning");
                }}
        public static void number35 (){
        Scanner input = new Scanner(System.in);
            System.out.print("Input the number of revolution you can do in seconds: ");
            int a = input.nextInt();
            System.out.print("Input the number of minute you can do in a hour: ");
            int b = input.nextInt();
            System.out.print("Input the total number of hours you can do in doing revolution in a day: ");
            int c = input.nextInt();
            for ( int counter = 1;c >= counter;   counter++){
            JOptionPane.showMessageDialog(null, a);
             a = a * b * c;
            }}
    public static void number36(){
        Scanner entry = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("How many times you want to display \"programming\"?");
            int a = input.nextInt();
            for( int counter = 1 ;a >= counter; counter++){
            JOptionPane.showMessageDialog(null, "programming");
            }}
        public static void number37 (){
        Scanner input = new Scanner(System.in);
            System.out.println("How many times you want to display \"welcome\"?");
            int a = input.nextInt();
            for( int counter = 1 ;a >= counter; counter++){
            JOptionPane.showMessageDialog(null, "welcome");
        }
    }
         public static void number38 (){
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number of Geometric sequece: ");
            int a = input.nextInt();
            System.out.print("Input the factor between two terms: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            for ( int counter = 1;c >= counter;     counter++){
            JOptionPane.showMessageDialog(null, a);
             a = a * b;
            }
        }
         public static void number39 (){
            Scanner input = new Scanner(System.in);
            System.out.print("Input the first number of Arithmetic sequece: ");
            int a = input.nextInt();
            System.out.print("Input the factor between two terms: ");
            int b = input.nextInt();
            System.out.print("Input the terms you want to display: ");
            int c = input.nextInt();
            for ( int counter = 1;c >= counter;   counter++){
            JOptionPane.showMessageDialog(null, a);
             a = a + b;
            }
        }
          public static void number40() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number you want to do multiplication table:");
            int num1 = input.nextInt();
            int c;
            for (int counter = 1; counter <= 10; counter++ ){
                c = num1 * counter;
                JOptionPane.showMessageDialog(null, num1 + "x" + counter + "=" + c);  
            }}
        public static void number41 (){
            System.out.println("ENTER THE NUMBER OF MONTHS BETWEEN 1-12:");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int months = a;
            String monthString;
            switch (months) {
                case 1: monthString = "JANUARY";
                break;
                case 2: monthString = "FEBRUARY";
                break;
                case 3: monthString = "MARCH";
                break;
                case 4: monthString = "APRIL";
                break;
                case 5: monthString = "MAY";
                break;
                case 6: monthString = "JUNE";
                break;
                case 7: monthString = "JULY";
                break;
                case 8: monthString = "AUGUST";
                break;
                case 9: monthString = "SEPTEMBER";
                break;
                case 10: monthString = "OCTOBER";
                break;
                case 11: monthString = "NOVEMBER";
                break;
                case 12: monthString = "DECEMBER";
                break;
                default: monthString = "INVALID INPUT";
                break;
            }
        JOptionPane.showMessageDialog(null, monthString);
        }
        public static void number42 (){
            System.out.println("CHOOSE THE COLOR OF DANGER OF RAINFALL FROM 1-3");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int warning = a;
            String warningString;
            switch (warning) {
                case 1: warningString = "GREEN WARNING";
                break;
                case 2: warningString = "YELLOW WARNING";
                break;
                case 3: warningString = "RED WARNING";
                break;
                default: warningString = "INVALID INPUT";
                break;
    }
                JOptionPane.showMessageDialog(null, warningString);
        }
        public static void number43 (){
            System.out.println("ENTER YOUR GRADE FROM 1-3");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int grade = a;
            String gradeString;
            switch (grade) {
                case 1: gradeString = "EXCELLENT";
                break;
                case 2: gradeString = "YOU PASSED";
                break;
                case 3: gradeString = "YOU FAILED";
                break;
                default: gradeString = "INVALID INPUT";
                break;
    }
                JOptionPane.showMessageDialog(null, gradeString);
        }
        public static void number44 (){
            System.out.println("ENTER THE NUMBER OF DAYS BETWEEN 1-7:");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int days = a;
            String dayString;
            switch (days) {
                case 1: dayString = "MONDAY";
                break;
                case 2: dayString = "TUESDAY";
                break;
                case 3: dayString = "WEDNESDAY";
                break;
                case 4: dayString = "THURSDAY";
                break;
                case 5: dayString = "FRIDAY";
                break;
                case 6: dayString = "SATURDAY";
                break;
                case 7: dayString = "SUNDAY";
                break;
                default: dayString = "INVALID INPUT";
                break;

    }
                JOptionPane.showMessageDialog(null, dayString);
        }
        public static void number45 (){
            System.out.println("INPUT THE TEMPERATURE OF WATER");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int temperature = a;
            String temperatureString;
            switch (temperature) {
                case 100: temperatureString = "The water is bioling";
                break;
                default: temperatureString = "The water is not boiling or it's boiling aready";
                break;
    }
                JOptionPane.showMessageDialog(null, temperatureString);
        }        
        public static void number46 (){
            System.out.println("CHOOSE WONDERS OF THE WORLD, 1-7");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int wondersoftheworld = a;
            String wondersoftheworldString;
            switch (wondersoftheworld) {
                case 1: wondersoftheworldString = "Colossus of Rhodes";
                break;
                case 2: wondersoftheworldString = "Great Pyramid of Giza";
                break;
                case 3: wondersoftheworldString = "Hanging Gardens of Babylon";
                break;
                case 4: wondersoftheworldString = "Lighthouse of Alexandria";
                break;
                case 5: wondersoftheworldString = "Mausoleum at Halicarnassus";
                break;
                case 6: wondersoftheworldString = "Statue of Zeus at Olympia";
                break;
                case 7: wondersoftheworldString = "Temple of Artemis at Ephesus";
                break;
                default: wondersoftheworldString = "INVALID INPUT";
                break;
    }
                JOptionPane.showMessageDialog(null, wondersoftheworldString);
        }
        public static void number47 (){
            System.out.println("ENTER PLANETS IN THE SOLAR SYSTEM,1-9");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int PLPANETS = a;
            String PLPANETSString;
            switch (PLPANETS) {
                case 1: PLPANETSString = "MERCURY";
                break;
                case 2: PLPANETSString = "VENUS";
                break;
                case 3: PLPANETSString = "EARTH";
                break;
                case 4: PLPANETSString = "MARS";
                break;
                case 5: PLPANETSString = "JUPITER";
                break;
                case 6: PLPANETSString = "STAURN";
                break;     
                case 7: PLPANETSString = "URANUS";
                break;
                case 8: PLPANETSString = "NEPTUNE";
                break;
                case 9: PLPANETSString = "PLUTO";
                break;
                default: PLPANETSString = "INVALID INPUT";
                break;
    }
                JOptionPane.showMessageDialog(null, PLPANETSString);
        }
        public static void number48(){
            System.out.println("RATE YOUR DIVING SKILLS FROM 1-5: ");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int dive = a;
            String diveString;
            switch (dive ) {
                case 1: diveString = "YOU'RE NEWBIE DIVER";
                break;
                case 2: diveString = "YOU'RE PROGRESSING DIVER";
                break;
                case 3: diveString = "YOU'RE A GREAT BREATH HOLDER DIVER";
                break;
                case 4: diveString = "YOU'RE EXCELLENT DIVER";
                break;
                case 5: diveString = "YOU'RE PRO DIVER";
                break;
            default: diveString = "INVALID INPUT";
                break;
    }
                JOptionPane.showMessageDialog(null, diveString);
        }
        public static void number49() {
            System.out.println("Enter the a number for top populated countries, 1-3");
            Scanner insert = new Scanner(System.in);
            int a = insert.nextInt();
            int country = a;
            String countryString;
            switch (country) {
                case 1:
                    countryString = "China";
                    break;
                case 2: 
                    countryString = "India";
                    break;
                case 3:
                    countryString = "United States";
                    break;
                default:
                    countryString = "Invalid Input";
                break;
    }
                JOptionPane.showMessageDialog(null, countryString);
        }
        public static void number50 (){
            System.out.println("INPUT YOUR TEMPERATURE");
            Scanner insert = new Scanner (System.in);
            int a = insert.nextInt();
            int bodytemperature = a;
            String bodytemperatureString;
            switch (bodytemperature) {
                case 37: bodytemperatureString = "You're temperature is normal";
                break;
                default: bodytemperatureString = "You're either cold or sick.";
                break;
        }
            JOptionPane.showMessageDialog(null, bodytemperatureString);
        }
        public static void number51(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you have a ticket for seminar?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Does it have a signature from the organization?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You can enter the seminar");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You can't enter the seminar");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You can't enter the seminar");
           } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number52(){
            Scanner input = new Scanner(System.in);
            System.out.println("Did you read the essay?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Did you included all from that essay?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You can pass the quiz");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You could pass the quiz");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You can't pass the quiz");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number53(){
            Scanner input = new Scanner(System.in);
            System.out.println("Did you practiced the jumping rope?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Did you practiced all of the types of jumps in jumping rope?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You can pass the midterm exam in PE");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You could pass the midterm exam in PE");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You can't pass the midterm exam in PE");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number54(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you play Mobile Legends?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Does your credit score goes equal or beyond 90?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You can play rank game");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You can't play rank game");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You might don't heared it yet");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number55(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you know how to swim?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Can you lasts for long in water without any help of vest/floating objects?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You can swim freely in deep water level");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You can practice your endurance in swimming");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You must not swim alone in deep water level");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number56(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you know the regulation in PLV: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Are you able to obey it?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You are disciplined");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You are not disciplined");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You must know it");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number57(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you sleep late at night?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Is there any problem with your sleeping?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "Tell it to your relatives");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "Practice sleeping regularly");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You sleep regularly");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number58(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you love your course?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Do you find it easy?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "Pursue your dream");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "Try to be with smart friends to guide you");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "Shift to other course");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number59(){
            Scanner input = new Scanner(System.in);
            System.out.println("Are you interested to travel abroad?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Do you have a passporte?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "You just need money");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "You must get yourself a passporte");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You might just want to travel within your country");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                }}
        public static void number60(){
            Scanner input = new Scanner(System.in);
            System.out.println("Do you do exercising?: ");
            String x =input.nextLine();
            if(x.equals ("yes")){
                System.out.println("Are doing it reguarly?: ");
                String y = input.nextLine();
                if (y.equals("yes")){
                JOptionPane.showMessageDialog(null, "Do not stop it");    
                } else if (y.equals("no"))
                JOptionPane.showMessageDialog(null, "Manage your time properly");      
            else{
                JOptionPane.showMessageDialog(null, "Invalid input");
                }
            } else if (x.equals("no")){
                JOptionPane.showMessageDialog(null, "You might just don't have time for it");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input");
                
            }}}
        



