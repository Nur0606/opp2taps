import java.util.Arrays;

public class MyClass {
        String fullName;
        int age;
        String [] subjects;
        String favoriteDish;


        public MyClass(String fullName, int age, String[] subjects, String favoriteDish) {
            this.fullName = fullName;
            this.age = age;
            this.subjects = subjects;
            this.favoriteDish = favoriteDish;
        }

        public MyClass(){
        }

        @Override
        public String toString() {
            return "Person " +
                    "fullName = " + fullName + '\'' +
                    ", age = " + age +
                    ", subjects = " + Arrays.toString(subjects) +
                    ", favoriteDish = " + favoriteDish + '\'';
        }
    }

