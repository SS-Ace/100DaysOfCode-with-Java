public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets >= 0) {
            int requiredbuckets = 0;
            double totalbuckets = (width * height) / areaPerBucket;
            requiredbuckets = (int) Math.ceil(totalbuckets - extraBuckets);
            return requiredbuckets;
        }

        else{
            return -1;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width > 0 && height > 0 && areaPerBucket > 0) {
            int requiredbuckets = 0;
            double totalbuckets = (width * height) / areaPerBucket;
            requiredbuckets = (int) Math.ceil(totalbuckets);
            return requiredbuckets;
        } else {
            return -1;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area > 0 && areaPerBucket > 0) {
            int requiredbuckets = 0;
            double totalbuckets = area / areaPerBucket;
            requiredbuckets = (int) Math.ceil(totalbuckets);
            return requiredbuckets;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args){

        System.out.println(getBucketCount(3.4, -2.1, -2.5, -1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 1.5));


    }
}