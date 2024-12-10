/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.util.StreamUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class ResourcePrincipalAuthenticationDetailsProviderTest {

    final String privateKey =
            StreamUtils.toString(
                    new FileInputStream("src/test/resources/pkcs1_private_key.pem"),
                    StandardCharsets.UTF_8);

    static final String fakeToken =
            "eyJraWQiOiJhc3dfb2MxX2RlMWIxZmM3IiwiYWxnIjoiUlMyNTYifQ"
                    + "."
                    + "eyJzdWIiOiJvY2lkMS5pbnN0YW5jZS5vYzEuaWFkLmFudXdjbGp0NDZjbGRkeWM3N3Q3cGpzeHFxdXF3aHBuZG03YnJ1YXlmd2U2M2ZkcmRldW80Y2VvazRwYSIsIm9wYy1jZXJ0dHlwZSI6Imluc3RhbmNlIiwiaXNzIjoiYXV0aFNlcnZpY2Uub3JhY2xlLmNvbSIsImZwcmludCI6IjZDOjMzOkMwOjdBOjAxOjE3OjNEOjNBOkQ5OjUwOkYzOjNEOkUxOjdCOkVDOkE5OjgzOjExOjlDOjU3IiwicHR5cGUiOiJpbnN0YW5jZSIsImF1ZCI6Im9jaSIsIm9wYy10YWciOiJWMSxvY2lkMS5keW5hbWljZ3JvdXAub2MxLi5hYWFhYWFhYSwzZ215cHZ4eGsyangyem54aDI3cjZ3YTV6aGFmYmxudnl0YmlmbGp0ajdkNm5oc2dkNGdhLGg1ZXc3ZXFqM3FiZ2tpeXkzbW50aG54Z3RvN2hxYnlrd29nbzNiYjRndWZzZ21rd3VxZnEiLCJ0dHlwZSI6Ing1MDkiLCJvcGMtaW5zdGFuY2UiOiJvY2lkMS5pbnN0YW5jZS5vYzEuaWFkLmFudXdjbGp0NDZjbGRkeWM3N3Q3cGpzeHFxdXF3aHBuZG03YnJ1YXlmd2U2M2ZkcmRldW80Y2VvazRwYSIsImV4cCI6MTYyOTk3MDg2Niwib3BjLWNvbXBhcnRtZW50Ijoib2NpZDEudGVuYW5jeS5vYzEuLmFhYWFhYWFhazdxc2o2bHRmd2VrNWN4bDZ4cHR6bmFucjJrdDdmeHJiaG83ZGkzdmNoYWY2bTVhcHhlcSIsImlhdCI6MTYyOTk2OTY2NiwianRpIjoiMTRiYTRiYjYtNzg3OC00ODIwLTgyZjMtZTk0ZmE5M2JkMjc3IiwidGVuYW50Ijoib2NpZDEudGVuYW5jeS5vYzEuLmFhYWFhYWFhazdxc2o2bHRmd2VrNWN4bDZ4cHR6bmFucjJrdDdmeHJiaG83ZGkzdmNoYWY2bTVhcHhlcSIsImp3ayI6IntcImtpZFwiOlwiNkM6MzM6QzA6N0E6MDE6MTc6M0Q6M0E6RDk6NTA6RjM6M0Q6RTE6N0I6RUM6QTk6ODM6MTE6OUM6NTdcIixcIm5cIjpcInVjazZ3Mk5RREMwdXl0eFNBMlBWQkZtOGUxRUNabVBJaERvenAxVVdjblIyVEJTWUErQ2V4V2hUbksyKyswNGNvbWVtVTdBT1Urd1RqTFZNRlZLR3lCWXpVdWdQV0Vhbmx1UVRmN241djdLem5JR2c2YkJGU3lHdlM5SUJUOWVWVUlQWXRoaFBPeTZnMFhWUXdERnJCakV0Z0IzNzVUSWhrU21RY2RhbllnOTJpVU1vYVg4ZHhzNUtuUmpUbExrVExaTUh5ZlduWldCc0hLWXNIZDJ3T01qUDJ5ZDJWR2ZvNGJGTWdFeCttTnVxVkxlQXd1UGZ0dm56MU5JQWp2cUZ6c253Zlhtemo0cTNRaStHSGFub0JtSG1yTldHbnlMQ0xVb2p1ZFZ3clk2bWtONS9sUGFXaSttNThueXRnNVc4WWFhMjQvckJsTkdwZHRIU3h5RDRBd1wiLFwiZVwiOlwiQVFBQlwiLFwia3R5XCI6XCJSU0FcIixcImFsZ1wiOlwiUlMyNTZcIixcInVzZVwiOlwic2lnXCJ9Iiwib3BjLXRlbmFudCI6Im9jaWQxLnRlbmFuY3kub2MxLi5hYWFhYWFhYWs3cXNqNmx0ZndlazVjeGw2eHB0em5hbnIya3Q3ZnhyYmhvN2RpM3ZjaGFmNm01YXB4ZXEifQ"
                    + "."
                    + "KG8tVWD6Nl8SiuG9zDXnZjGZVzbaGoyBABZwBQZLyaxu0lB5xXdm_RYtvyR0yygULwLvuIPzbkwTSJcJE5HjReQUIdqTP_P4E4fGbVdwrU6dYNsTOMf2jZZVQtUP7iWsJKrvOzs1ZwI1nmoZ5uRUSNq6sUbznHWk8qvdPycEuR6n5aElrXp0cHgfg9IxAU1CnnVjklIJHZslCIL-7GV2jWjn5ae456pAYFF0ihpEHpaMTnBdNkYjHq3rDnOXG3194E5_rQzwdLYhliID5uYhRr8bvfm2fvH9UMSA8ZLkSPg3Xc_z_2xrlawguLjw5Bw5-UojFYFfcJIiyXE6Qqtlqw";

    private final String passPhrase = "passphrase";
    private final RpConfig rpConfig = new RpConfig();

    private final static AtomicInteger counter = new AtomicInteger(0);

    public ResourcePrincipalAuthenticationDetailsProviderTest() throws FileNotFoundException {}

    @Test
    public void test_ResourcePrincipalAuthenticationDetailsProviderFromSupplier_Init() {
        counter.set(0);
        ResourcePrincipalAuthenticationDetailsProvider
                .ResourcePrincipalAuthenticationDetailsProviderBuilder.build_2_2(
                privateKey, passPhrase, this::rpSupplier, rpConfig, "us-ashburn-1", "");
        Assert.assertEquals(1, counter.get());
    }

    @Test
    public void test_ResourcePrincipalAuthenticationDetailsProviderFromSupplier_Refresh() {
        counter.set(0);
        ResourcePrincipalAuthenticationDetailsProvider authenticationDetailsProvider =
                ResourcePrincipalAuthenticationDetailsProvider
                        .ResourcePrincipalAuthenticationDetailsProviderBuilder.build_2_2(
                        privateKey, passPhrase, this::rpSupplier, rpConfig, "us-ashburn-1", "");
        Assert.assertEquals(1, counter.get());

        authenticationDetailsProvider.refresh();
        Assert.assertEquals(2, counter.get());
    }

    private String rpSupplier(RpConfig rpConfig) {
        counter.incrementAndGet();
        return fakeToken;
    }

    private static class RpConfig {}
}
