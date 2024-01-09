/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model.internal;

import com.oracle.bmc.model.RegionSchema;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class JsonConverterTest {

    @Test
    public void parseJsonSchema() {

        String regionBlob =
                "{ \"realmKey\" : \"RTC\",\"realmDomainComponent\" : \"oraclecloud-foobar.com\",\"regionKey\" : \"rrr\",\"regionIdentifier\" : \"us-rrr-1\"}";
        RegionSchema regionSchema = JsonConverter.jsonBlobToObject(regionBlob, RegionSchema.class);
        assertThat(regionSchema.getRegionIdentifier(), is("us-rrr-1"));
        assertThat(regionSchema.getRegionKey(), is("rrr"));
        assertThat(regionSchema.getRealmKey(), is("RTC"));
        assertThat(regionSchema.getRealmDomainComponent(), is("oraclecloud-foobar.com"));
    }

    @Test
    public void parseJsonSchemaUnknownKey() {

        String regionBlob =
                "{ \"realmKey\" : \"RTC\",\"realmDomainComponent\" : \"oraclecloud-foobar.com\",\"regionKey\" : \"rrr\",\"regionIdentifier\" : \"us-rrr-1\",\"iaasDomainComponent\":\"value\",\"gibberishKey\":\"gibberishValue\"}";
        RegionSchema regionSchema = JsonConverter.jsonBlobToObject(regionBlob, RegionSchema.class);
        assertThat(regionSchema.getRegionIdentifier(), is("us-rrr-1"));
        assertThat(regionSchema.getRegionKey(), is("rrr"));
        assertThat(regionSchema.getRealmKey(), is("RTC"));
        assertThat(regionSchema.getRealmDomainComponent(), is("oraclecloud-foobar.com"));
    }

    @Test
    public void parseJsonSchemaInvalid() {

        String regionBlob =
                "{ \"realmKey\" :: \"RTC\",\"realmDomainComponent\" : \"oraclecloud-foobar.com\",\"regionKey\" : \"rrr\",\"regionIdentifier\" : \"us-rrr-1\"}";
        RegionSchema regionSchema = JsonConverter.jsonBlobToObject(regionBlob, RegionSchema.class);
        assertNull(regionSchema);
    }

    @Test
    public void parseJsonArray() {
        String jsonArr =
                "[{ \"realmKey\" : \"RYT\",\"realmDomainComponent\" : \"oracleclour-bar.com\",\"regionKey\" : \"atl\",\"regionIdentifier\" : \"ap-atl-1\"},{ \"realmKey\" :\"YUT\",\"realmDomainComponent\" : \"oraclefoobar-cloud.com\",\"regionKey\" : \"LAV\",\"regionIdentifier\" : \"us-lav-1\"}]";
        RegionSchema[] regionSchemas =
                JsonConverter.jsonBlobToObject(jsonArr, RegionSchema[].class);
        assertThat(regionSchemas.length, is(2));
    }

    @Test
    public void parseRegionObjToJson() {
        String regionExpected =
                "{\"realmKey\":\"RTC\",\"realmDomainComponent\":\"oraclecloud-foobar.com\",\"regionKey\":\"gty\",\"regionIdentifier\":\"us-gty-1\"}";
        RegionSchema regionSchema =
                new RegionSchema("RTC", "oraclecloud-foobar.com", "gty", "us-gty-1");
        String regionBlob = JsonConverter.objectToJsonBlob(regionSchema);
        assertThat(regionExpected, is(regionBlob));
    }
}
