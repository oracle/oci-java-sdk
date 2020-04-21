/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.oracle.bmc.io.DuplicatableInputStream;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * Simple wrapper over FileInputStream that also exposes the File used
 * to create the stream.
 * <p>
 * This version also support mark/reset.
 */
@Slf4j
public class WrappedFileInputStream extends FileInputStream implements DuplicatableInputStream {
    @Getter private final File sourceFile;

    private long markPosition = 0L;

    public WrappedFileInputStream(File file) throws FileNotFoundException {
        super(file);
        this.sourceFile = file;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int readlimit) {
        try {
            markPosition = super.getChannel().position();
            LOG.trace("mark called, markPosition={}", markPosition);
        } catch (IOException e) {
            throw new IllegalStateException("Could not mark position");
        }
    }

    @Override
    public synchronized void reset() throws IOException {
        LOG.trace("reset called, markPosition={}", markPosition);
        super.getChannel().position(markPosition);
    }

    @Override
    public InputStream duplicate() {
        return create(sourceFile);
    }

    /**
     * Same as calling the ctor, except will throw an unchecked IllegalArgumentException
     * if the file isn't found.
     *
     * @param file the file to read from.
     * @return a new stream.
     */
    public static WrappedFileInputStream create(File file) {
        try {
            return new WrappedFileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("File not found", e);
        }
    }
}
