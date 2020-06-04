package ClassTest.Optonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Option {
    static Order order=new Order(12,123.);

    static Order findById(int id, List<Order>orders){
        for (Order order: orders) {
            if (order.id==id) return order;
            }
        return new Order(0,0.);
    }
    static Optional<Order> findByIdOpt(int id, List<Order>orders){
        Optional<Order>opt=orders.stream().filter(oo->oo.id==id).findAny();
        return opt;
    }

    static List <Order> makeOrders(int N){
        Random random=new Random();
        List <Order> orders=new ArrayList<Order>();
        for (int i = 0; i <N; i++) {
            Double val=random.nextDouble()*1000;
            Order order=new Order(i,val);
            orders.add(order);
        }
        return  orders;
    }
    static void pprint(List<Order>orders){
        for (Order order: orders) {
            System.out.println(order);
        }
    }
    public static void main(String[] args) {
        List <Order> ords=makeOrders(15);
//        Order o=findById(2,ords);
//        System.out.println(o);
//        Order o5=findById(10,ords);
//        System.out.println(o5);

//        List <Order>ordsnew=ords.stream().filter(oo->oo.id%2==0).collect(Collectors.toList());//forEach(System.out::println);
//        System.out.println(ordsnew);
//        pprint(ordsnew);
//        for (int i = 0; i <5 ; i++) {
//            Optional<Order>opt=ords.stream().filter(oo->oo.id%2==0).findAny();
//            System.out.println(opt);
        Optional<Order> optOrd=findByIdOpt(30, ords);
        //
        if (optOrd.isPresent()){
            System.out.println(optOrd.get());
        }

    }
}
