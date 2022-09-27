package lista01.ex07;

public class FaceVideo extends Video {
    private final boolean[] bitsFace;

    public FaceVideo() {
       bitsFace = new boolean[] {
              false, true, false, true, false, false, false, false, false, true, true, false, false, false, false,
              true, false, true, true, true, false, false, true, false, false, true, true, false, false, false, false,
              true, false, true, true, false, false, false, true, false, true, true, true, false, true, false, false,
              true, false, true, true, false, true, true, true, false, false, true, true, true, false, false, true,
              true, false, false, true, false, true, true, false, false, false, false, true, false, false, false,
              false, false, false, true, true, true, false, true, true, false, false, true, true, false, false, false,
              true, true, false, false, true, false, false, false, false, false, false, true, true, false, false,
              false, true, true, false, true, true, false, true, true, true, true, false, true, true, false, true,
              true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false,
              true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false,
              true, false, true, false, true, true, false, true, false, false, true, false, true, true, true, false,
              true, false, true, false, false, true, false, true, true, true, false
       };
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }

    @Override
    public String getContent() {
        String content = "", bits = "";

        for (boolean b: getBitsFace()) {
            char bit = '0';
            if (b) {
                bit = '1';
            }
            bits += bit;

            if (bits.length() == 8) {
                content += (char) Integer.parseInt(bits, 2);
                bits = "";
            }
        }
        return content;
    } 
}
