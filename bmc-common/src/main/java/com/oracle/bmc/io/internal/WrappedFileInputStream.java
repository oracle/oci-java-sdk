/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.io.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.oracle.bmc.io.DuplicatableInputStream;

import lombok.Getter;

/**
 * Simple wrapper over FileInputStream that also exposes the File used
 * to create the stream.
 * <p>
 * This version also support mark/reset.
 */
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
        } catch (IOException e) {
            throw new IllegalStateException("Could not mark position");
        }
    }

    @Override
    public synchronized void reset() throws IOException {
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
