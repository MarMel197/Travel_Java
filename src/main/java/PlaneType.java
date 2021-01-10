 public enum PlaneType {
        AIRBUS_A380(600,100),
        BOEING_737(400,40),
        CESSNA_182(4,8);

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
