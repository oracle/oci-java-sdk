/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
                "{ \"realmKey\" : \"OC5\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"TIW\",\"regionIdentifier\" : \"us-tacoma-1\"}";
        RegionSchema regionSchema = JsonConverter.jsonBlobToObject(regionBlob, RegionSchema.class);
        assertThat(regionSchema.getRegionIdentifier(), is("us-tacoma-1"));
        assertThat(regionSchema.getRegionKey(), is("TIW"));
        assertThat(regionSchema.getRealmKey(), is("OC5"));
        assertThat(regionSchema.getRealmDomainComponent(), is("oraclensrcloud.com"));
    }

    @Test
    public void parseJsonSchemaInvalid() {

        String regionBlob =
                "{ \"realmKey\" :: \"OC5\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"TIW\",\"regionIdentifier\" : \"us-tacoma-1\"}";
        RegionSchema regionSchema = JsonConverter.jsonBlobToObject(regionBlob, RegionSchema.class);
        assertNull(regionSchema);
    }

    @Test
    public void parseJsonArray() {
        String jsonArr =
                "[{ \"realmKey\" : \"OC6\",\"realmDomainComponent\" : \"oraclecloud.com\",\"regionKey\" : \"ATL\",\"regionIdentifier\" : \"ap-atlanta-1\"},{ \"realmKey\" :\"OC7\",\"realmDomainComponent\" : \"oraclensrcloud.com\",\"regionKey\" : \"LAV\",\"regionIdentifier\" : \"us-lasvegas-1\"}]";
        RegionSchema[] regionSchemas =
                JsonConverter.jsonBlobToObject(jsonArr, RegionSchema[].class);
        assertThat(regionSchemas.length, is(2));
    }

    @Test
    public void parseRegionObjToJson() {
        String regionExpected =
                "{\"realmKey\":\"OC6\",\"realmDomainComponent\":\"oraclensrcloud.com\",\"regionKey\":\"FRD\",\"regionIdentifier\":\"us-florida-1\"}";
        RegionSchema regionSchema =
                new RegionSchema("OC6", "oraclensrcloud.com", "FRD", "us-florida-1");
        String regionBlob = JsonConverter.objectToJsonBlob(regionSchema);
        assertThat(regionExpected, is(regionBlob));
    }
}
