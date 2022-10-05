





    class Company
    {
        private String name;
        private String headQuarters;
        public Company(String nm, String location)
        {
            name = nm;
            headQuarters= location;
        }
        public String readName()
        {
            return name;
        }
        public String readNationality()
        {
            return headQuarters;
        }
        public String readHeadquarters()
        {
            return headQuarters;
        }
        public void updateHeadquarters(String location)
        {
            headQuarters = location;
        }
    }

