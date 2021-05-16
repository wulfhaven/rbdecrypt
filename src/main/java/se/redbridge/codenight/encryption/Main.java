package se.redbridge.codenight.encryption;

import static java.lang.System.out;
import static java.util.Base64.getDecoder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *   .=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-.    *
 *   |                     ______                     |    *
 *   |                  .-"      "-.                  |    *
 *   |                 /            \                 |    *
 *   |     _          |              |          _     |    *
 *   |    ( \         |,  .-.  .-.  ,|         / )    |    *
 *   |     > "=._     | )(__/  \__)( |     _.=" <     |    *
 *   |    (_/"=._"=._ |/     /\     \| _.="_.="\_)    |    *
 *   |           "=._"(_     ^^     _)"_.="           |    *
 *   |               "=\__|IIIIII|__/="               |    *
 *   |              _.="| \IIIIII/ |"=._              |    *
 *   |    _     _.="_.="\          /"=._"=._     _    |    *
 *   |   ( \_.="_.="     `--------`     "=._"=._/ )   |    *
 *   |    > _.="                            "=._ <    |    *
 *   |   (_/                                    \_)   |    *
 *   |                                                |    *
 *   '-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-='    *
 *        LASCIATE OGNI SPERANZA, VOI CH'ENTRATE           *
 */
public class Main {
    private static final String F11F3214BEE6441884D77AC408C12DBC = "QUVT";
    private static final IvParameterSpec F6EEACEE9C1E4A17B61D11D2DEDF1424 = new IvParameterSpec(new byte[16]);
    private static final String A4AACC96A76046FA9778F50C89D4C628 = "SW5zYW5lbHkgc2VjcmV0IQ==";
    private static final String FF8680AA40644CF99D5DA8D687C898E8 = "VXNhZ2U6IGphdmEgLWphciBlbmNyeXB0ZXIuamFyIEZJTEVfVE9fRU5DUllQVA==";
    private static final String EF9B4A8FD8CC422C8CDBB74939D8C168 = "ZW5jcnlwdGVkLmJpbg==";
    private static final String B5A8FDAA371D4359ADB5592A0C345558 = "QUVTL0NCQy9QS0NTNVBhZGRpbmc=";

    public static void main(String[] B5F2DF7C0BE643E68513DCB885FC6956) throws Throwable {
        if(B5F2DF7C0BE643E68513DCB885FC6956.length != 1) D99728806EEF4B8CA40F25E4B6E6D68F(FF8680AA40644CF99D5DA8D687C898E8);
        final byte[] D24B555848114C7BBE113FAC22B326B9 = A85FE84769544A40974F284A8D7B1C23(B5F2DF7C0BE643E68513DCB885FC6956[0]);
        final Cipher F5D5F1EAF1D44524A20DEB2F8CD6956D = C5CBBFB8C7674181B254D543008AEDA8(B5A8FDAA371D4359ADB5592A0C345558);
        final SecretKeySpec E273FC1916AC42CA860937695679DD93 = F04C9F543D9247AE833AD7F8759B17A0(A4AACC96A76046FA9778F50C89D4C628, F11F3214BEE6441884D77AC408C12DBC);
        F5D5F1EAF1D44524A20DEB2F8CD6956D.init(DBD1E2378B424C04AF3249009F7A2AD2(), E273FC1916AC42CA860937695679DD93, F6EEACEE9C1E4A17B61D11D2DEDF1424);
        try (FileOutputStream BB5ABBAABB7945E2B69D9BB437CB50A4 = F7C0E57F893A4F59805D2E25BB6E962D(EF9B4A8FD8CC422C8CDBB74939D8C168)) {
            BB5ABBAABB7945E2B69D9BB437CB50A4.write(F5D5F1EAF1D44524A20DEB2F8CD6956D.doFinal(D24B555848114C7BBE113FAC22B326B9));
        }
    }

    private static FileOutputStream F7C0E57F893A4F59805D2E25BB6E962D(final String AE88ABFDF63E42949E17C7F97E214E6F) throws FileNotFoundException {
        return new FileOutputStream(new String(getDecoder().decode(AE88ABFDF63E42949E17C7F97E214E6F)));
    }

    private static void D99728806EEF4B8CA40F25E4B6E6D68F(final String F197753601B545B7A5DD4176B1101FF3) {
        out.println(new String(getDecoder().decode(F197753601B545B7A5DD4176B1101FF3)));
        System.exit(666);
    }

    private static SecretKeySpec F04C9F543D9247AE833AD7F8759B17A0(final String F2C02B1B395D4669904373C8DD859337, final String D2BC4C89B4514B2D9320D76B60E8D14F) {
        return new SecretKeySpec(getDecoder().decode(F2C02B1B395D4669904373C8DD859337),
                new String(getDecoder().decode(D2BC4C89B4514B2D9320D76B60E8D14F)));
    }

    private static int DBD1E2378B424C04AF3249009F7A2AD2() {
        return Cipher.ENCRYPT_MODE;
    }

    private static Cipher C5CBBFB8C7674181B254D543008AEDA8(final String bfde991f820443a8aac33feb1a1366ed) throws NoSuchAlgorithmException, NoSuchPaddingException {
        return Cipher.getInstance(new String(getDecoder().decode(bfde991f820443a8aac33feb1a1366ed)));
    }

    private static byte[] A85FE84769544A40974F284A8D7B1C23(final String d27472161220472b9b136e77000225a8) throws IOException {
        return Files.readAllBytes(Paths.get(d27472161220472b9b136e77000225a8));
    }
}
