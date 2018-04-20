package com.connect.chat.connectus.data.fixtures;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.UUID;

/*
 * Created by Anton Bevza on 1/13/17.
 */
abstract class FixturesData {

    static SecureRandom rnd = new SecureRandom();

    static ArrayList<String> avatars = new ArrayList<String>() {
        {
            add("http://share3s.com/wp-content/uploads/2018/01/H%C3%ACnh-%E1%BA%A3nh-g%C3%A1i-xinh-m%E1%BB%99c-m%E1%BA%A1c-khi%E1%BA%BFn-d%C3%A2n-m%E1%BA%A1ng-chao-%C4%91%E1%BA%A3o-con-tim-16.jpg");
            add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSncaHvBZohCgrPD-Cvfll130hfgDRZ4lvAImAxITXV95Ut9rIn");
            add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5J1KS0kkmuKtzH_GKupX6Kve2K33VFkn3-r4l5qJN7W4NoWOr");
            add("https://i.imgur.com/u436brw.jpg");
        }
    };

    static final ArrayList<String> groupChatImages = new ArrayList<String>() {
        {
            add("http://share3s.com/wp-content/uploads/2018/01/H%C3%ACnh-%E1%BA%A3nh-g%C3%A1i-xinh-m%E1%BB%99c-m%E1%BA%A1c-khi%E1%BA%BFn-d%C3%A2n-m%E1%BA%A1ng-chao-%C4%91%E1%BA%A3o-con-tim-16.jpg");
            add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSncaHvBZohCgrPD-Cvfll130hfgDRZ4lvAImAxITXV95Ut9rIn");
            add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT5J1KS0kkmuKtzH_GKupX6Kve2K33VFkn3-r4l5qJN7W4NoWOr");
            add("https://i.imgur.com/u436brw.jpg");
        }
    };

    static final ArrayList<String> groupChatTitles = new ArrayList<String>() {
        {
            add("Hiệp, Đức");
            add("Hiệp, Đức , Hoàn");
            add("Hiệp, Đức, Hoàn, Dương");
        }
    };

    static final ArrayList<String> names = new ArrayList<String>() {
        {
            add("Đinh Nguyễn Hoàng Hiệp");
            add("Vũ Minh Đức");
            add("Trần Ngọc Hoàn");
            add("Phan Anh Dương");
            add("Lê Vũ Hoàng");
            add("Nguyễn Văn Nam");
            add("Vũ Ngọc Quý");
            add("Lưu Quỳnh Trang");
            add("Nguyễn Thị Thu Hương");
            add("Phạm Thị Thu Phương");
        }
    };

    static final ArrayList<String> messages = new ArrayList<String>() {
        {
            add("Hello!");
            add("This is my phone number - +1 (234) 567-89-01");
            add("Here is my e-mail - myemail@example.com");
            add("Hey! Check out this awesome link! www.github.com");
            add("Hello! No problem. I can today at 2 pm. And after we can go to the office.");
            add("At first, for some time, I was not able to answer him one word");
            add("At length one of them called out in a clear, polite, smooth dialect, not unlike in sound to the Italian");
            add("By the bye, Bob, said Hopkins");
            add("He made his passenger captain of one, with four of the men; and himself, his mate, and five more, went in the other; and they contrived their business very well, for they came up to the ship about midnight.");
            add("So saying he unbuckled his baldric with the bugle");
            add("Just then her head struck against the roof of the hall: in fact she was now more than nine feet high, and she at once took up the little golden key and hurried off to the garden door.");
        }
    };

    static final ArrayList<String> images = new ArrayList<String>() {
        {
            add("https://habrastorage.org/getpro/habr/post_images/e4b/067/b17/e4b067b17a3e414083f7420351db272b.jpg");
            add("http://www.designboom.com/wp-content/uploads/2015/11/stefano-boeri-architetti-vertical-forest-residential-tower-lausanne-switzerland-designboom-01.jpg");
        }
    };

    static String getRandomId() {
        return Long.toString(UUID.randomUUID().getLeastSignificantBits());
    }

    static String getRandomAvatar() {
        return avatars.get(rnd.nextInt(avatars.size()));
    }

    static String getRandomGroupChatImage() {
        return groupChatImages.get(rnd.nextInt(groupChatImages.size()));
    }

    static String getRandomGroupChatTitle() {
        return groupChatTitles.get(rnd.nextInt(groupChatTitles.size()));
    }

    static String getRandomName() {
        return names.get(rnd.nextInt(names.size()));
    }

    static String getRandomMessage() {
        return messages.get(rnd.nextInt(messages.size()));
    }

    static String getRandomImage() {
        return images.get(rnd.nextInt(images.size()));
    }

    static boolean getRandomBoolean() {
        return rnd.nextBoolean();
    }
}
