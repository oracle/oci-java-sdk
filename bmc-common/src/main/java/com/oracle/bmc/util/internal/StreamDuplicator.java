/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import java.io.InputStream;

import com.google.common.base.Supplier;
import com.oracle.bmc.io.DuplicatableInputStream;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class StreamDuplicator {
    private final Supplier<InputStream> streamSupplier;

    /**
     * Test to see whether the stream can be duplicated, such that multiple
     * readers can read from the same underlying stream in parallel without
     * problems.
     * <p>
     * Duplicatable streams are currently those that implement {@link DuplicatableInputStream}.
     *
     * @param stream
     *            The stream to test.
     * @return true if the stream can be duplicated, false if not.
     */
    public static boolean canDuplicate(InputStream stream) {
        return stream instanceof DuplicatableInputStream;
    }

    /**
     * Creates a new duplicator that can copy a stream into a brand new instance
     * that can be read from independently of the given one.
     * <p>
     * Callers should first call {@link #canDuplicate(InputStream)} to verify the
     * stream can be duplicated.
     *
     * @param stream
     *            The stream to duplicate.
     * @return A new duplicator instance.
     */
    public static StreamDuplicator createDuplicator(InputStream stream) {
        DuplicatableInputStream duplicateStream = (DuplicatableInputStream) stream;
        return new StreamDuplicator(new DuplicateSupplier(duplicateStream));
    }

    /**
     * Creates a duplicate stream.
     *
     * @return A new stream.
     */
    public InputStream duplicate() {
        return streamSupplier.get();
    }

    @RequiredArgsConstructor
    private static class DuplicateSupplier implements Supplier<InputStream> {
        private final DuplicatableInputStream inputStream;

        @Override
        public InputStream get() {
            return inputStream.duplicate();
        }
    }
}
