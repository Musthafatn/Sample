package com.example;

import java.util.Scanner;

public class Calculator {

	public static void main(final String[] args) {
		final Scanner s = new Scanner(System.in);
		final Long aa;
		final int a = s.nextInt();
		final int b = s.nextInt();
		final int c = add(a, b);
		System.out.println(c);
//		final var aaaaa = String.format("%s%n%s%nVAT Registration: %s%nBranch Code: %s", "aaaa", "bbbbb", "ccccc",
//				"ddddddd");
//		System.out.println(aaaaa);
		System.out.println("hi");
	}

	public static int add(final int a, final int b) {
		final int x = a;
		final int y = b;
		final int z = x + y;
		return z;
	}

	public static int sub(final int a, final int b) {
		final int x = a;
		final int y = b;
		final int z = x - y;
		return z;
	}

}

//cartResponse
//.setPlatformShippingPromotion(getPlatformShippingPromotion(translations, cartWrapper.getCartData()));

//private Map<String, Object> getPlatformShippingPromotion(final Map<String, String> translations,
//final List<Map<String, Object>> cartData) {
//for (final Map<String, Object> data : cartData) {
//final List<Map<String, Object>> minValueShippingPromotions = new ArrayList<>();
//final var shippingPromotions = ((List<Map<String, Object>>) data.get("shippingPromotions")).stream()
//		.filter(promotion -> "platform".equals(promotion.get("createdBy"))).collect(Collectors.toList());
//if (!shippingPromotions.isEmpty()) {
//	var minValueShippingPromotion = shippingPromotions.get(0);
//	var minimumOrderValue = (Double) minValueShippingPromotion.get("minimumOrderValue");
//	for (final Map<String, Object> shippingPromotion : shippingPromotions) {
//		if ((Double) shippingPromotion.get("minimumOrderValue") < minimumOrderValue) {
//			minValueShippingPromotion = shippingPromotion;
//			minimumOrderValue = (Double) minValueShippingPromotion.get("minimumOrderValue");
//		}
//	}
//	minValueShippingPromotions.add(minValueShippingPromotion);
//}
//}
//return null;
//}
