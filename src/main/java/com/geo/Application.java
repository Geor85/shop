package com.geo;


import com.geo.entity.Category;
import com.geo.entity.Image;
import com.geo.entity.Product;
import com.geo.entity.User;
import com.geo.repository.*;
import com.geo.service.ProductService;
import com.geo.service.UserService;
import com.geo.service.impl.ProductServiceImpl;
import org.hibernate.criterion.Order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

   @Bean
    public CommandLineRunner demo(final UserService userService, final OrderRepository orderRepository,
                                  final ProductRepository productRepository, final ProductService productService, final OrderDetailsRepository orderDR,
                                  final ImageRepository imageRepository, final CategoryRepository categoryRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {

                /*productRepository.saveAndFlush(new Product("Cfcsc", 25.0, false));
                productRepository.saveAndFlush(new Product("ddddd", 53.0, true));
                productRepository.saveAndFlush(new Product("jjjjj", 89.0, true));
                productRepository.saveAndFlush(new Product("jjjjj", 89.0, true));
                productRepository.saveAndFlush(new Product("gcgcg", 89.0, true));
                productRepository.saveAndFlush(new Product("jjjjj", 89.0, true));
                productRepository.saveAndFlush(new Product("jjjjj", 89.0, true));

                /*Order order = new Order();
                OrderDetails orderDetails = new OrderDetails();
                orderDetails.setProduct(productRepository.findOne(1L));
                orderDetails.setProdQuantity(2);
                orderDetails.setOrder(order);
                OrderDetails orderDetails2 = new OrderDetails(productRepository.findOne(2L), 2);
                orderDetails2.setOrder(order);
                OrderDetails orderDetails3 = new OrderDetails(productRepository.findOne(3L), 1);
                orderDetails3.setOrder(order);
                List<OrderDetails> orderDetailsList = new ArrayList<>();
                orderDetailsList.add(orderDetails);
                orderDetailsList.add(orderDetails2);
                orderDetailsList.add(orderDetails3);
                order.setOrderDetails(orderDetailsList);
                orderRepository.saveAndFlush(order);
                /*orderDR.saveAndFlush(orderDetails);
                orderDR.saveAndFlush(orderDetails2);
                orderDR.saveAndFlush(orderDetails3);*/

                //Order order = orderRepository.findOne(1L);

                //System.out.println(orderRepository.findOne(1L).getOrderDetails().get(1).getProduct().getName());
                //System.out.println(orderDR.findOne(2L).getOrder().getCreated());


                /*userService.addUser(new User("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8",
                        UserRole.ADMIN));
                userService.addUser(new User("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8",
                        UserRole.USER));*/
                /*
                File file = new File("F:\\capture_02062011_185057.jpg");
                byte[] picture = new byte[(int)file.length()];
                Image image = new Image();
                image.setImage(picture);
                imageRepository.saveAndFlush(image);
                */
                /*
                Sort sort =  new Sort(Sort.Direction.DESC, "price"); //sorting by prise
                */
                /*
                File file = new File("F:\\capture_02062011_185057.jpg");
                byte[] picture = new byte[(int)file.length()];
                Image image = new Image();
                image.setImage(picture);
                imageRepository.saveAndFlush(image);

                categoryRepository.saveAndFlush(new Category("Шаппуни", image));
                categoryRepository.saveAndFlush(new Category("Мыло", image));
                categoryRepository.saveAndFlush(new Category("Уход для лица", image));
                */
                Category category = new Category();
                category.setId(2L);
                //Sort sort =  new Sort(Sort.Direction.DESC, "price");
                Pageable pageable = new PageRequest(0, 10);


                String word = "гигиены";
                //imageRepository.saveAndFlush()
                List<User> listPr = userService.findUsersbyAllColumns("ser", pageable);
                //List<Product> listPr = productRepository.findByNameLike("sham");

                for(int i =0; i < listPr.size(); i++) {
                    System.out.println(listPr.get(i).getName());
                }

            }
        };
    }
}