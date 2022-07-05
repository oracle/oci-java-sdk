/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.transfer.internal;

/**
 * MultipartUploadFailedPartDetails has details about the part number and
 * the failure cause for the failed upload part
 */
public final class MultipartUploadFailedPartDetails {
    private final int partNumber;
    private final Exception failureCause;

    @java.beans.ConstructorProperties({"partNumber", "failureCause"})
    public MultipartUploadFailedPartDetails(final int partNumber, final Exception failureCause) {
        this.partNumber = partNumber;
        this.failureCause = failureCause;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public Exception getFailureCause() {
        return this.failureCause;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof MultipartUploadFailedPartDetails)) return false;
        final MultipartUploadFailedPartDetails other = (MultipartUploadFailedPartDetails) o;
        if (this.getPartNumber() != other.getPartNumber()) return false;
        final java.lang.Object this$failureCause = this.getFailureCause();
        final java.lang.Object other$failureCause = other.getFailureCause();
        if (this$failureCause == null
                ? other$failureCause != null
                : !this$failureCause.equals(other$failureCause)) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getPartNumber();
        final java.lang.Object $failureCause = this.getFailureCause();
        result = result * PRIME + ($failureCause == null ? 43 : $failureCause.hashCode());
        return result;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MultipartUploadFailedPartDetails(partNumber="
                + this.getPartNumber()
                + ", failureCause="
                + this.getFailureCause()
                + ")";
    }
}
