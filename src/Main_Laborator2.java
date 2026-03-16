void main() {
    List<Integer> x = new ArrayList();
    List<Integer> y = new ArrayList();
    List<Integer> xPlusY = new ArrayList(); //a
    Set<Integer> zSet = new TreeSet(); //b
    List<Integer> xMinusY = new ArrayList();//c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList(); //d

    x.add(1);
    x.add(5);
    x.add(3);
    x.add(7);
    x.add(2);

    y.add(3);
    y.add(8);
    y.add(2);
    y.add(6);
    y.add(1);
    y.add(4);
    y.add(9);
    Collections.sort(x);
    Collections.sort(y);

//a)

    xPlusY.addAll(x);
    xPlusY.addAll(y);
    Collections.sort(xPlusY);

    //b)

    for (Integer val : x) {
        if (y.contains(val)) {
            zSet.add(val);
        }
    }


    //c)

    for(Integer val : x){
        if(y.contains(val)){
            xMinusY.add(val);

        }
    }

    //d)
    for (Integer val : x) {
        if (val <= p) {
            xPlusYLimitedByP.add(val);
        }
    }
    for (Integer val : y) {
        if (val <= p) {
            xPlusYLimitedByP.add(val);
        }
    }

    Collections.sort(xPlusYLimitedByP);

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("xPlusY = " + xPlusY);
    System.out.println("zSet = " + zSet);
    System.out.println("xMinusY = " + xMinusY);
    System.out.println("xPlusYLimitedByP = " + xPlusYLimitedByP);

}