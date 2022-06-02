package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.mouse;

import me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat.BigCat;

public class Mouse {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println("Mouse: " + cat.publicInstanceVar);
    }
}
