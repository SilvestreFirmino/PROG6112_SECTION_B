package prog6112_section_b;


    class Heroes {
        private String heroName;
        private String heroPower;
        private String heroSkills;

        public Heroes(String heroName, String heroPower , String heroSkills) {
            this.heroName = heroName;
            this.heroPower = heroPower;
            this.heroSkills = heroSkills;
        }

        public String getHeroName() { return heroName; }
        public String getHeroPower() { return heroPower; }
        public String getHeroSkills() { return heroSkills; }

        public void display() {
            System.out.println(heroName + " is saving the world with " + heroPower + "!");
        }

        public void skills() {
            System.out.println("No one can match " + heroName + "'s skills of " + heroSkills + "\n");
        }
    }
