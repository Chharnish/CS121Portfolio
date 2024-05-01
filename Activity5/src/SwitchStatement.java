import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        //init da scanner :o
        Scanner input = new Scanner(System.in);
        //input plsss
        System.out.println("Please input a planet name from the Milky Way: ");
        String planet = input.next().toLowerCase();
        //switches
        switch(planet) {
            case "sun" :
                System.out.println("""
                             Sun:   The star of the solar system
           Distance from the sun:   I AM THE SUN
                  Orbital Period:   25 days on the equator & 34 days on the poles
    Length of days in earth days:   once again, I AM THE SUN
                          Radius:   432,690 Mi
                Interesting info:   AAAAAAAHHH I AM ON FIRE PLEASE HELP ME!!!! eternal stop drop and roll..
                        """);
                break;
            case "mercury":
                System.out.println("""
                                             Mercury:   1st Planet in the solar system
                               Distance from the sun:   36 Million Mi
                                      Orbital Period:   88 D
                        Length of days in earth days:   59 D
                                              Radius:   1,516 Mi
                                            Comments:   Terrible vacation spot ever..
                                            """);
                break;
            case "venus":
                System.out.println("""
                                               Venus:   2nd Planet in the solar system
                               Distance from the sun:   67 Million Mi
                                      Orbital Period:   225 D
                        Length of days in earth days:   243 D
                                              Radius:   3,760 Mi
                                            Comments:   Earth's hot sister
                                            """);
                break;
            case "earth":
                System.out.println("""
                                               Earth:   3rd Planet in the solar system
                               Distance from the sun:   93 Million Mi
                                      Orbital Period:   365 D
                        Length of days in earth days:   1 D
                                              Radius:   3,959 Mi
                                            Comments:   Really bad infestation of people :(
                                            """);
                break;
            case "mars":
                System.out.println("""
                                                Mars:   4th Planet in the solar system
                               Distance from the sun:   142 Million Mi
                                      Orbital Period:   687 D
                        Length of days in earth days:   1 D 0 H 37 M
                                              Radius:   2,106 Mi
                                            Comments:   Elon Musk wants to go here / iron ball
                                            """);
                break;
            case "jupiter":
                System.out.println("""
                                             Jupiter:   5th Planet in the solar system
                               Distance from the sun:   484 Million Mi
                                      Orbital Period:   ~ 12 Y
                        Length of days in earth days:   9 H 56 M
                                              Radius:   43,441 Mi
                                            Comments:   Big red Spot :o
                                            """);
                break;
            case "saturn":
                System.out.println("""
                                              Saturn:   6th Planet in the solar system
                               Distance from the sun:   484 Million Mi
                                      Orbital Period:   ~ 29 Y
                        Length of days in earth days:   10 H 34 M
                                              Radius:   36,184 Mi
                                            Comments:   Ring hog
                                            """);
                break;
            case "uranus":
                System.out.println("""
                                              Uranus:   7th Planet in the solar system
                               Distance from the sun:    1.784 Billion Mi
                                      Orbital Period:   ~ 84 Y
                        Length of days in earth days:   17 H 14 M
                                              Radius:   15,759 Mi
                                            Comments:   PPPPPFFFFFFFFFTTTTT HAHAHAHAHAHA
                                            """);
                break;
            case "neptune":
                System.out.println("""
                                             Neptune:   8th Planet in the solar system
                               Distance from the sun:   2.793 Billion Mi
                                      Orbital Period:   ~ 165 Y
                        Length of days in earth days:   16 H 6 M
                                              Radius:   15,299 Mi
                                            Comments:   a snow ball but if it was made of solid ice instead of snow
                                            """);
                break;
            case "pluto":
                System.out.println("""
                                               Pluto:   Dwarf planet behind Neptune
                               Distance from the sun:   3.7 Billion Mi
                                      Orbital Period:   ~ 248 Y
                        Length of days in earth days:   153 H
                                              Radius:   738 Mi
                                            Comments:   L - lost planet status - Womp Womp
                                            """);
                break;
            default :
                System.out.println("""
       Planet name would go here:   non existent :/
           Distance from the sun:   0 mi
                  Orbital Period:   ??? D
    Length of days in earth days:   ??? D
                          Radius:   ??? Mi
                        Comments:   You would know if you actually named a planet right..
                        """);
                break;


            }
        }
    }

















