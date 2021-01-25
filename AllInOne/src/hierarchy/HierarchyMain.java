package hierarchy;

public class HierarchyMain {
    public static void main(String [] args){
        SamsungNoteI sni = new SamsungNoteI();
        System.out.println(sni.getModel() + " " + sni.getDisplayResolution() + " " + sni.getDisplaySize()
                + " " + sni.getBattery() + " " + sni.getPen() + " " + sni.getOS());

        SamsungNoteII snii = new SamsungNoteII();
        System.out.println(snii.getModel() + " " + snii.getDisplayResolution() + " " + snii.getDisplaySize()
                + " " + snii.getBattery() + " " + snii.getPen() + " " + snii.getOS());

        SamsungNoteIII sniii = new SamsungNoteIII();
        System.out.println(sniii.getModel() + " " + sniii.getDisplayResolution() + " " + sniii.getDisplaySize()
                + " " + sniii.getBattery() + " " + sniii.getPen() + " " + sniii.getOS());

        OppoX ox = new OppoX();
        System.out.println(ox.getModel() + " " + ox.getDisplayResolution() + " " + ox.getDisplaySize()
                + " " + ox.getBattery() + " " + ox.getStretchableDisplay() + " " + ox.getOS());

        HuaweiMateX hmx = new HuaweiMateX();
        System.out.println(hmx.getModel() + " " + hmx.getDisplayResolution() + " " + hmx.getDisplaySize()
                + " " + hmx.getBattery() + " " + hmx.getFoldable() + " " + hmx.getOS());

    }


}
