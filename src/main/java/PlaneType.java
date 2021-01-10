 public enum PlaneType {
        AIRBUS_A380(600,7000),
        BOEING_737(400,5500),
        CESSNA_182(4,25);

        // Bit like a property in a class!! its internal. final keyword like const
         private final Integer capacity;
         private final Integer totalWeight;

        // Like a constructor but not

        PlaneType(Integer capacity, Integer totalWeight){
                this.capacity = capacity;
                this.totalWeight = totalWeight;
        }

        public int getCapacity(){
                return capacity;
        }
         public int getTotalWeight(){
                 return totalWeight;
         }
}
