/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.io.internal;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * A wrapper around a {@link FileInputStream} that provides mark-and-reset capabilities.
 *
 * This allows for retries on a {@link FileInputStream}.
 */
public class ResettableFileInputStream extends FilterInputStream {
    private final boolean alreadyWrapped;
    private final State state;

    /**
     * Constructor for a file input stream that provides mark-and-reset capabilities.
     * @param fis file input stream to wrap
     * @throws IllegalArgumentException if the file channel of the file input stream does not provide a position
     */
    public ResettableFileInputStream(FileInputStream fis) {
        super(fis);
        alreadyWrapped = isAlreadyWrapped(fis);
        if (!alreadyWrapped && !canBeWrapped(fis)) {
            throw new IllegalArgumentException(
                    "The provided FileInputStream cannot be wrapped because it does not provide a way to change position");
        }
        if (alreadyWrapped) {
            state = new AlreadyWrappedState();
        } else {
            state = new NeedsToBeWrappedState(fis.getChannel());
        }
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int readlimit) {
        state.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        state.reset();
    }

    /**
     * Return true if the provided {@link FileInputStream} can be wrapped to provide mark-and-reset
     * capabilities.
     *
     * @param fis the {@link FileInputStream} to check
     * @return true if it can be wrapped
     */
    public static boolean canBeWrapped(FileInputStream fis) {
        try {
            fis.getChannel().position();
            return true;
        } catch (IOException e) {
            LOG.trace(
                    "FileInputStream cannot be wrapped, since its file channel does not provide a position");
            return false;
        }
    }

    /**
     * Return true if the provided {@link FileInputStream} has already been wrapped, and therefore
     * supports mark-and-reset capabilities.
     * @param fis the {@link FileInputStream} to check
     * @return true if it is already wrapped
     */
    public static boolean isAlreadyWrapped(FileInputStream fis) {
        return fis instanceof WrappedFileInputStream;
    }

    /**
     * State interface for dealing with mark and reset.
     */
    private interface State {
        /**
         * @see java.io.InputStream#mark(int)
         * @param readlimit
         */
        void mark(int readlimit);

        /**
         * @see InputStream#reset()
         * @throws IOException
         */
        void reset() throws IOException;
    }

    /**
     * This is for streams that are already wrapped, i.e. {@link WrappedFileInputStream}.
     */
    private final class AlreadyWrappedState implements State {
        @Override
        public synchronized void mark(int readlimit) {
            in.mark(readlimit);
        }

        @Override
        public synchronized void reset() throws IOException {
            in.reset();
        }
    }

    /**
     * This is for {@link FileInputStream}s that are not already wrapped.
     */
    private final class NeedsToBeWrappedState implements State {
        private FileChannel fileChannel;
        private long markPosition = -1;

        public NeedsToBeWrappedState(FileChannel fileChannel) {
            this.fileChannel = fileChannel;
        }

        @Override
        public synchronized void mark(int readlimit) {
            try {
                markPosition = fileChannel.position();
                LOG.trace("mark called, markPosition={}", markPosition);
            } catch (IOException ex) {
                markPosition = -1;
            }
        }

        @Override
        public synchronized void reset() throws IOException {
            LOG.trace("reset called, markPosition={}", markPosition);
            if (markPosition < 0) {
                throw new IOException("Resetting to invalid mark");
            }
            fileChannel.position(markPosition);
        }
    }
}
