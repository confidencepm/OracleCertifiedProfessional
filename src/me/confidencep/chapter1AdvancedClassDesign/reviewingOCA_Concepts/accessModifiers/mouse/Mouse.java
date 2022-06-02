package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.mouse;

import me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat.BigCat;
import me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat.species.Lynx;

public class Mouse {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println("Mouse: " + cat.publicInstanceVar);

        Lynx lynx = new Lynx();
        System.out.println(lynx.publicInstanceVar);
    }
}
