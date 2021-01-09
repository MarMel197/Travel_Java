 public enum PlaneType {
        AIRBUS_A380(100),
        BOEING_737(40),
        CESSNA_182(8);

        // Bit like a property in a class!! its internal. final keyword like const
        private final int totalWeight;

        // Like a constructor but not

        PlaneType(int totalWeight){
            this.totalWeight = totalWeight;

        }
        public int getTotalWeight(){
            return totalWeight;
        }
}
