package blog;


public class Randomizer {

    public static String TextGen() {
        String[] arr1 = {"24/7", "multi-Tier", "30,000 foot", "B-to-B",
                "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma",
                "critical-path", "dynamic"};
        String[] arr2 = {"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
                "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] arr3 = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
        int oneLength = arr1.length;
        int twoLength = arr2.length;
        int threeLength = arr3.length;
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = arr1[rand1] + " " + arr2[rand2] + " " + arr3[rand3];
        return phrase;

    }

    public static String Date() {

        String[] datearray = {"11.12.2013 13:46", "21.11.2013 12:46", "30.11.2013 23:02"};

        int oneLength = datearray.length;
        int randdate = (int) (Math.random() * oneLength);
        String date = datearray[randdate];

        return date;

    }


        public static String Pic() {

        String[] picarray = {"http://cdn.cutestpaw.com/wp-content/uploads/2013/12/Most-Famous-Felines-001.jpg",
                "http://cdn.cutestpaw.com/wp-content/uploads/2013/12/Most-Famous-Felines-007.jpg",
                "http://cdn.cutestpaw.com/wp-content/uploads/2013/12/Most-Famous-Felines-024.jpg",
                "http://cdn.cutestpaw.com/wp-content/uploads/2013/12/Most-Famous-Felines-035.jpg",
                "http://cdn.cutestpaw.com/wp-content/uploads/2013/12/Most-Famous-Felines-032.jpg"};

        int oneLength = picarray.length;
            int randpic = (int) (Math.random() * oneLength);
            String pic = picarray[randpic];

            return pic;

    }

        public static String Tag() {

            String[] tagarray = {"business",
                    "cats",
                    "blablabla",
                    "lydybr",
                    "very short notice"};

            int oneLength = tagarray.length;
                int randtag = (int) (Math.random() * oneLength);
                String tag = tagarray[randtag];

                return tag;

        }
        
        
        public static String Head() {

            String[] headarray = {"Head placeholder",
                    "Random quote",
                    "Everyone like cats",
                    "Nothing personal",
                    "Strictly business"};

            int oneLength = headarray.length;
                int randhead = (int) (Math.random() * oneLength);
                String head = headarray[randhead];

                return head;

        }
        
    }
