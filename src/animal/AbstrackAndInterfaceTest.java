package animal;

import duclap.Edible;

public class AbstrackAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];   //tạo cái mảng animal
        animals[0] = new Tiger();           // gán thằng con lên thằng cha sử dụng upcasting
        animals[1] = new Chicken();
        for (Animal animal : animals) {      //duyệt mảng
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {     //hiện giờ animal nó có 2 kiểu:tiger, chicken nên phải kiểm tra xem animal có phải kiểu chicken không
                Edible edibler = (Chicken) animal;   //  (chicken)animal =>ép từ cha về con. Rồi gán cho biến edibler có kiểu dữ liệu là Edible interface
                System.out.println(edibler.howToEat());
                System.out.println(((Chicken) animal).howToEat());
            }
        }
    }
}
