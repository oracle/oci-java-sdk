/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparableVersion implements Comparable<ComparableVersion> {
    public static final String SNAPSHOT_SUFFIX = "-SNAPSHOT";

    private final String original;

    private final ArrayList<Integer> items = new ArrayList<>();

    private final boolean isSnapshot;

    public ArrayList<Integer> getItems() {
        return items;
    }

    public ComparableVersion(String version) {
        if (version.isEmpty()) {
            throw new IllegalArgumentException("version may not be empty");
        }
        original = version;
        isSnapshot = version.toUpperCase().endsWith(SNAPSHOT_SUFFIX);
        if (isSnapshot) {
            version = version.substring(0, version.length() - SNAPSHOT_SUFFIX.length());
        }
        version = version.replace('-', '.').replace('_', '.');
        String[] splitVersion = version.split("\\.");
        for (String versionStr : splitVersion) {
            int parsedInt;
            try {
                parsedInt = Integer.parseInt(versionStr);
            } catch (NumberFormatException e) {
                // not a number, treat as -1
                parsedInt = -1;
            }
            this.items.add(parsedInt);
        }
    }

    public static Optional<ComparableVersion> buildComparableVersion(String version) {
        if (version == null || version.isEmpty()) {
            return Optional.empty();
        }
        try {
            return Optional.of(new ComparableVersion(version));
        } catch (IllegalArgumentException nfe) {
            return Optional.empty();
        }
    }

    /**
     * @param otherVersion - the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object is less than, equal
     *     to, or greater than the otherVersion. The version that has more parts is considered newer
     *     "1.2.3.4" is newer than "1.2.3"
     */
    public int compareTo(ComparableVersion otherVersion) {
        int i = 0;
        while (i < otherVersion.getItems().size() && i < this.getItems().size()) {
            int result = this.getItems().get(i) - otherVersion.getItems().get(i);
            if (result != 0) {
                return result;
            }
            ++i;
        }
        // The version with more parts is newer:
        // Example: this: 1.2.3.4 vs. otherVersion: 1.2.3 => 1.2.3.4 is newer
        // unless all the additional versions are 0:
        // Example: this: 1.2.3.4 vs. otherVersion: 1.2.3.4.0.0 => both versions are the same
        if (i < this.getItems().size()) {
            while (i < this.getItems().size()) {
                if (this.getItems().get(i) != 0) {
                    return 1;
                }
                ++i;
            }
        } else if (i < otherVersion.getItems().size()) {
            while (i < otherVersion.getItems().size()) {
                if (otherVersion.getItems().get(i) != 0) {
                    return -1;
                }
                ++i;
            }
        }

        // everything is the same, check snapshots
        if (this.isSnapshot && !otherVersion.isSnapshot) {
            // this is a snapshot, that means otherVersion is newer
            return -1;
        } else if (!this.isSnapshot && otherVersion.isSnapshot) {
            // otherVersion is a snapshot, that means thus version is newer
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComparableVersion that = (ComparableVersion) o;
        return isSnapshot == that.isSnapshot && items.equals(that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, isSnapshot);
    }

    public String getOriginal() {
        return original;
    }

    public boolean isSnapshot() {
        return isSnapshot;
    }

    @Override
    public String toString() {
        String snapshotSuffix = isSnapshot ? "-SNAPSHOT" : "";
        String dotted = items.stream().map(i -> String.valueOf(i)).collect(Collectors.joining("."));
        String parsedVersion = dotted + snapshotSuffix;
        if (!original.equals(parsedVersion)) {
            return original + " (parsed as " + dotted + snapshotSuffix + ")";
        } else {
            return original;
        }
    }
}
