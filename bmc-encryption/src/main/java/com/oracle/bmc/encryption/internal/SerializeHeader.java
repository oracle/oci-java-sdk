/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.encryption.internal;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.encryption.KmsMasterKey;
import com.oracle.bmc.encryption.MasterKeyProvider;

public class SerializeHeader {
    private final MasterKeyProvider provider;
    private static final int INITIAL_OFFSET = 6; //version(short) + header_size(int)
    // Upper bound on the JSON header allocation. The header carries key metadata,
    // IV and optional AAD context; legitimate values are far below this limit.
    private static final int MAX_HEADER_SIZE = 2 * 1024 * 1024; // 2 MB
    private static final short VERSION = 1;
    private static final String INVALID_HEADER_READ_SIZE_MESSAGE =
            "Failed to read a valid encryption header size. Check if this encrypted file has the correct format.";
    private static final String INVALID_HEADER_CREATE_SIZE_MESSAGE =
            "Failed to create a valid encryption header size. Reduce the encryption context size.";
    private static final ObjectMapper OBJECT_MAPPER =
            com.oracle.bmc.http.Serialization.getObjectMapper();

    public SerializeHeader(MasterKeyProvider provider) {
        this.provider = provider;
    }

    // Encryption Header
    public EncryptionHeader createHeader(
            DataKey dataKey, byte[] IVbytes, Map<String, String> context) {
        EncryptionHeader encryptionHeader = createEncryptionHeader(dataKey, IVbytes, context);
        String jsonHeader = serializeJsonHeader(encryptionHeader);
        byte[] jsonHeaderBytes = jsonHeader.getBytes();
        int headerLength =
                validateHeaderSize(jsonHeaderBytes.length, INVALID_HEADER_CREATE_SIZE_MESSAGE);
        ByteBuffer buffer = ByteBuffer.allocate(INITIAL_OFFSET + headerLength);
        buffer.putShort(VERSION);
        buffer.putInt(headerLength);
        buffer.put(jsonHeaderBytes);
        byte[] headerBytes = buffer.array();
        encryptionHeader.setHeaderBytes(headerBytes);
        return encryptionHeader;
    }

    private EncryptionHeader createEncryptionHeader(
            DataKey dataKey, byte[] ivBytes, Map<String, String> context) {
        EncryptionHeader encryptionHeader = new EncryptionHeader();
        KmsMasterKey kmsMasterKey = (KmsMasterKey) provider.getMasterKey();
        EncryptionKey encryptionKey =
                new EncryptionKey(
                        kmsMasterKey.getRegion(),
                        kmsMasterKey.getVaultId(),
                        kmsMasterKey.getKmsMasterKeyId(),
                        dataKey.getCiphertext());

        String contextString = mapToJson(context);
        encryptionHeader.setEncryptionHeader(
                encryptionKey, Base64.getEncoder().encodeToString(ivBytes), contextString);
        return encryptionHeader;
    }

    static String mapToJson(Map<String, ?> context) {
        String contextString = "";
        if (context != null) {
            try {
                contextString = OBJECT_MAPPER.writeValueAsString(context);
            } catch (JsonProcessingException e) {
                throw new RuntimeException("Failed to parse encryption header. ", e);
            }
        }
        return contextString;
    }

    private String serializeJsonHeader(EncryptionHeader encryptionHeader) {
        String jsonOutput = null;
        ObjectMapper objectMapper = com.oracle.bmc.http.Serialization.getObjectMapper();
        try {
            jsonOutput = objectMapper.writeValueAsString(encryptionHeader);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to parse encryption header. ", e);
        }
        return jsonOutput;
    }

    /////////////////////////////////////////////////////////////////////////////////////
    // Read Decryption Header
    /////////////////////////////////////////////////////////////////////////////////////

    public EncryptionHeader deserializeJsonHeader(byte[] header) {
        EncryptionHeader encryptionHeader;
        ObjectMapper objectMapper = com.oracle.bmc.http.Serialization.getObjectMapper();
        try {
            encryptionHeader = objectMapper.readValue(header, EncryptionHeader.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse encryption header.", e);
        }
        return encryptionHeader;
    }

    public EncryptionHeader readHeader(final InputStream decryptInputStream) throws IOException {
        // Read header intro
        byte[] readHeaderIntroBytes = new byte[INITIAL_OFFSET];
        readBytesFromStream(decryptInputStream, readHeaderIntroBytes);

        int jsonHeaderSize = getHeaderSize(readHeaderIntroBytes);

        // Read header Json
        byte[] jsonHeaderBytes = new byte[jsonHeaderSize];
        readBytesFromStream(decryptInputStream, jsonHeaderBytes);

        return deserializeJsonHeader(jsonHeaderBytes);
    }

    public int getHeaderSize(byte[] data) {
        ByteBuffer introHeader = ByteBuffer.wrap(data);
        short version = introHeader.getShort();
        if (version != VERSION) {
            throw new RuntimeException(
                    "Encryption header from the encrypted file ("
                            + version
                            + ") doesn't match expected version ("
                            + VERSION
                            + "). Check if this encrypted file has the correct format.");
        }
        return validateHeaderSize(introHeader.getInt(), INVALID_HEADER_READ_SIZE_MESSAGE);
    }

    private int validateHeaderSize(int size, String errorMessage) {
        if (size <= 0 || size > MAX_HEADER_SIZE) {
            throw new IllegalArgumentException(errorMessage);
        }
        return size;
    }

    private int readBytesFromStream(final InputStream decryptInputStream, byte[] readBytes)
            throws IOException {
        int readResult = decryptInputStream.read(readBytes);
        if (readResult <= 0) {
            throw new RuntimeException("Failed to read header from stream. Reached end of stream.");
        }
        return readResult;
    }
}
