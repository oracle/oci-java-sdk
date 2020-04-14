/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.encryption.internal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.encryption.internal.EncryptionKey;

import java.util.*;

public class EncryptionHeader {
    public final int encryptedContentFormat = 0;
    public final int algorithmId = 0;
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
                new ObjectMapper().readValue(additionalAuthenticatedData, HashMap.class);
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
