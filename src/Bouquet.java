public class Bouquet {
    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {

        this.flowers = flowers;
    }

    public float getBouquetCoast (){
        float sum = 0;
        for (Flower flower : flowers) {
            if(flower!= null){
                sum += flower.getCost();
            }
        }
        return sum + sum*0.1f;
    }
    public int getBouquetSpan(){
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if(flower!= null && flower.getLifeSpan()<minLifeSpan){
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;

    }


}
