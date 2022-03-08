/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.http.internal.RestClientFactory;

import java.util.*;

public class EncryptionHeader {
    private String additionalAuthenticatedData;
    private List<EncryptionKey> encryptedDataKeys = new ArrayList<>();
    private String iv;
    private byte[] headerBytes;

    public void setEncryptionHeader(
            EncryptionKey encryptionKey, String iv, String additionalAuthenticatedData) {
        this.encryptedDataKeys.add(encryptionKey);
        this.iv = iv;
        this.additionalAuthenticatedData = additionalAuthenticatedData;
    }

    @JsonIgnore
    public byte[] getIvBytes() {
        return Base64.getDecoder().decode(iv);
    }

    @JsonIgnore
    public byte[] getHeaderBytes() {
        return headerBytes;
    }

    public void setHeaderBytes(byte[] headerBytes) {
        this.headerBytes = headerBytes;
    }

    public String getAdditionalAuthenticatedData() {
        return additionalAuthenticatedData;
    }

    @JsonIgnore
    public Map<String, String> getContext() throws JsonProcessingException {
        if (additionalAuthenticatedData.isEmpty()) return new HashMap<String, String>();

        Map<String, String> result =
                RestClientFactory.getObjectMapper()
                        .readValue(additionalAuthenticatedData, HashMap.class);
        return result;
    }

    @JsonIgnore
    public EncryptionKey getEncryptionKey() {
        return encryptedDataKeys.get(0);
    }

    public List<EncryptionKey> getEncryptedDataKeys() {
        return encryptedDataKeys;
    }

    public String getIV() {
        return iv;
    }
}
