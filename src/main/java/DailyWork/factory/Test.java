//package factory;
//public class Test {
//
//    public interface Bean {
//    }
//
//    public static class MyBean implements Bean {
//    }
//
//    public static class YourBean implements Bean {
//    }
//
//    public static class HisBean implements Bean {
//    }
//
//    public static class HerBean implements Bean {
//    }
//
//    /**
//     * 用工厂模式完成代码
//     */
//    public static class Factory {
//        /**
//         * 建议仅仅修改此方法的实现
//         */
//    	public static <T extends Bean> T create(Class<? extends Bean> clazz){
//    		if(clazz.equals(MyBean.class)) {
//    			return (T) new MyBean();
//    		}
//    		else if(clazz.equals(YourBean.class)) {
//    			return (T) new YourBean();
//    		}
//    		else if(clazz.equals(HisBean.class)) {
//    			return (T) new HisBean();
//    		}
//    		else if(clazz.equals(HerBean.class)) {
//    			return (T) new HerBean();
//    		}
//			return null;
//        }
//    }
//
//    /**
//     * main函数的代码无需改动
//     */
//    public static void main(String[] args) {
//        MyBean myBean = Factory.create(MyBean.class);
//        YourBean yourBean = Factory.create(YourBean.class);
//        HisBean hisBean = Factory.create(HisBean.class);
//        HerBean herBean = Factory.create(HerBean.class);
//        System.out.println(myBean);
//        System.out.println(yourBean);
//        System.out.println(hisBean);
//        System.out.println(herBean);
//    }
//}
package DailyWork.factory;
public class Test {

    public interface Bean {
    }

    public static class MyBean implements Bean {
    }

    public static class YourBean implements Bean {
    }

    public static class HisBean implements Bean {
    }

    public static class HerBean implements Bean {
    }

    /*public interface Product {
    }*/

    /**
     * 工厂方法
     */
    public interface Factory {
        Bean createBean();

        /*当还需要创建其他类型的产品时，就需要在工厂中增加方法，
        也就变成了所谓的抽象工厂模式。
         Product createOtherProduct();*/
    }

    public static class MyBeanFactory implements Factory {
        @Override
        public Bean createBean() {
            return new MyBean();
        }
    }

    public static class YourBeanFactory implements Factory {
        @Override
        public Bean createBean() {
            return new YourBean();
        }
    }

    public static class HisBeanFactory implements Factory {
        @Override
        public Bean createBean() {
            return new HisBean();
        }
    }

    public static class HerBeanFactory implements Factory {
        @Override
        public Bean createBean() {
            return new HerBean();
        }
    }

    /**
     * 用工厂模式完成代码
     */
    public static class MyFactory {
        /**
         * 建议仅仅修改此方法的实现
         */
        @SuppressWarnings("unchecked")
        public static <T extends Bean> T create(Class<? extends Bean> clazz) {
            if (clazz != null) {
                try {
                    return (T) clazz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        public static Bean createBySimpleFactory(Class<? extends Bean> clazz) {
            if (clazz != null) {
                if (clazz.equals(MyBean.class)) {
                    return new MyBean();
                } else if (clazz.equals(YourBean.class)) {
                    return new YourBean();
                } else if (clazz.equals(HisBean.class)) {
                    return new HisBean();
                } else if (clazz.equals(HerBean.class)) {
                    return new HerBean();
                }
            }
            return null;
        }

        @SuppressWarnings("unchecked")
        public static <T extends Bean> T createBySimpleFactory2(Class<? extends Bean> clazz) {
            if (clazz != null) {
                try {
                    return (T) clazz.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

    }

    /**
     * main函数的代码无需改动
     */
    public static void main(String[] args) {
        MyBean myBean = MyFactory.create(MyBean.class);
        YourBean yourBean = MyFactory.create(YourBean.class);
        HisBean hisBean = MyFactory.create(HisBean.class);
        HerBean herBean = MyFactory.create(HerBean.class);
        System.out.println(myBean);
        System.out.println(yourBean);
        System.out.println(hisBean);
        System.out.println(herBean);

        //工厂方法/抽象工厂模式需要调用方知道自己需要什么
        Factory factory = new MyBeanFactory();
        myBean = (MyBean) factory.createBean();
        factory = new YourBeanFactory();
        yourBean = (YourBean) factory.createBean();
    }
}