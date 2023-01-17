/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Optional;

import com.oracle.bmc.util.StreamUtils;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AuthUtilsTest {
    @Test
    public void testBase64EncodeNoChunking() throws Exception {
        String key =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/auth_utils_test_public.pem"),
                        StandardCharsets.UTF_8);

        String publicKeyPEM =
                key.replace("-----BEGIN PUBLIC KEY-----", "")
                        .replaceAll("\n", "")
                        .replaceAll("\r", "")
                        .replace("-----END PUBLIC KEY-----", "");

        byte[] encoded = Base64.getDecoder().decode(publicKeyPEM);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(encoded);
        RSAPublicKey publicKey = (RSAPublicKey) keyFactory.generatePublic(keySpec);

        String s = AuthUtils.base64EncodeNoChunking(publicKey);

        assertEquals(
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Iq55yeKhH5Bjk+UUr537WZnWAyZBGLNm8gI0F/4+"
                        + "wht1PDuWq/ovx5Y9OONc3bcyGphYhUgBhEE94XHthqbFQzF7zc9MKH1IK6B7rimZ/J0/0WRnW7PI+xuTHyKGBZ+"
                        + "jJq5hV9T5WMk1hxGCMWhzEBqxQKLjU3BEUHp7A2DRQOT52uhkFNTut7koAGIJGfQQdyDFhK2jdm8J9u+C1OFWXy"
                        + "COTQjpaZaMJpDSdZWhGmSTfwvU/4564KIkKGBsW9MfML/HI2f+Lm9FijycrhwLs6ysZkbS7pocqLAwq2Ou3QeoH"
                        + "ReuuMySGd6Q721RlvzGbRSx2dWG4WXbSL67iF/EwIDAQAB",
                s);
    }

    @Test
    public void testToPublicKeyFromJwk() {
        // openssl rsa -pubin -inform PEM -text -noout < bmc-common/src/test/resources/auth_utils_test_public.pem
        String modulus =
                "d0:8a:b9:e7:27:8a:84:7e:41:8e:4f:94:52:be:\n"
                        + "77:ed:66:67:58:0c:99:04:62:cd:9b:c8:08:d0:5f:\n"
                        + "f8:fb:08:6d:d4:f0:ee:5a:af:e8:bf:1e:58:f4:e3:\n"
                        + "8d:73:76:dc:c8:6a:61:62:15:20:06:11:04:f7:85:\n"
                        + "c7:b6:1a:9b:15:0c:c5:ef:37:3d:30:a1:f5:20:ae:\n"
                        + "81:ee:b8:a6:67:f2:74:ff:45:91:9d:6e:cf:23:ec:\n"
                        + "6e:4c:7c:8a:18:16:7e:8c:9a:b9:85:5f:53:e5:63:\n"
                        + "24:d6:1c:46:08:c5:a1:cc:40:6a:c5:02:8b:8d:4d:\n"
                        + "c1:11:41:e9:ec:0d:83:45:03:93:e7:6b:a1:90:53:\n"
                        + "53:ba:de:e4:a0:01:88:24:67:d0:41:dc:83:16:12:\n"
                        + "b6:8d:d9:bc:27:db:be:0b:53:85:59:7c:82:39:34:\n"
                        + "23:a5:a6:5a:30:9a:43:49:d6:56:84:69:92:4d:fc:\n"
                        + "2f:53:fe:39:eb:82:88:90:a1:81:b1:6f:4c:7c:c2:\n"
                        + "ff:1c:8d:9f:f8:b9:bd:16:28:f2:72:b8:70:2e:ce:\n"
                        + "b2:b1:99:1b:4b:ba:68:72:a2:c0:c2:ad:8e:bb:74:\n"
                        + "1e:a0:74:5e:ba:e3:32:48:67:7a:43:bd:b5:46:5b:\n"
                        + "f3:19:b4:52:c7:67:56:1b:85:97:6d:22:fa:ee:21:\n"
                        + "7f:13";
        modulus = modulus.replace("\n", "").replace(":", "");
        String exponent = "AQAB";
        JWK jwk = new JWK("kid", modulus, exponent);

        Optional<RSAPublicKey> rsaPublicKeyOptional = AuthUtils.toPublicKeyFromJwk(jwk);
        assertTrue(rsaPublicKeyOptional.isPresent());

        assertEquals(
                new BigInteger(
                        "2707571348102967113559743139415023298274484661452344212687342872771265986992742583394870616429249519181763295019347586706788245843488629342223482413291025317723483457516901512903557464278989318774456904155559607761384871703383386804879875339110343839811607183941496225857147838030786451537512268040335685304107832784530310747485353797796399548355566411881372748249551401108443734186095579656169576584285204281459947838717800596734534942492286298344744134721580818390562783811173929896714861497904368836207678895748821333165551085989812063708068506039077506486882719012139308090170919661585376982838072023829487507413326647063263519237176851495884709676550680061628567430281057145138621908030504040705882908967650340946050727596151998620034051158797324170716744896748992243642883584779469521485850614067738353007050413035318566413940775969645232759381397961957247873685829202154613017059069100721555052425516914057601954479479"),
                rsaPublicKeyOptional.get().getModulus());
        assertEquals(new BigInteger("65537"), rsaPublicKeyOptional.get().getPublicExponent());
    }

    @Test
    public void testGetEncodedCertificateFromPem() throws IOException {
        String fakeCert =
                StreamUtils.toString(
                        new FileInputStream("src/test/resources/auth_utils_test_cert.pem"),
                        StandardCharsets.UTF_8);

        byte[] encodedCertificateFromPem = AuthUtils.getEncodedCertificateFromPem(fakeCert);
        String asBase64 = Base64.getEncoder().encodeToString(encodedCertificateFromPem);
        assertEquals(
                "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Iq55yeKhH5Bjk+UUr537WZnWAyZBGLNm8gI0F/4+wht1PDuWq/ovx5Y9OONc3bcyGphYhUgBhEE94XHthqbFQzF7zc9MKH1IK6B7rimZ/J0/0WRnW7PI+xuTHyKGBZ+jJq5hV9T5WMk1hxGCMWhzEBqxQKLjU3BEUHp7A2DRQOT52uhkFNTut7koAGIJGfQQdyDFhK2jdm8J9u+C1OFWXyCOTQjpaZaMJpDSdZWhGmSTfwvU/4564KIkKGBsW9MfML/HI2f+Lm9FijycrhwLs6ysZkbS7pocqLAwq2Ou3QeoHReuuMySGd6Q721RlvzGbRSx2dWG4WXbSL67iF/EwIDAQAB",
                asBase64);
    }

    @Test
    public void testUrlSafeBase64Decode() {
        assertArrayEquals(AuthUtils.base64Decode("++//"), AuthUtils.base64Decode("--__"));
        assertEquals(null, AuthUtils.base64Decode(null));
    }
}
