/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Thread snapshot.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ThreadSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ThreadSnapshot extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeStamp", "threadSnapshotDetails", "stackTrace"})
    public ThreadSnapshot(
            java.util.Date timeStamp,
            java.util.List<SnapshotDetail> threadSnapshotDetails,
            java.util.List<StackTraceElement> stackTrace) {
        super();
        this.timeStamp = timeStamp;
        this.threadSnapshotDetails = threadSnapshotDetails;
        this.stackTrace = stackTrace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Snapshot time.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
        private java.util.Date timeStamp;

        /**
         * Snapshot time.
         *
         * @param timeStamp the value to set
         * @return this builder
         **/
        public Builder timeStamp(java.util.Date timeStamp) {
            this.timeStamp = timeStamp;
            this.__explicitlySet__.add("timeStamp");
            return this;
        }
        /**
         * Snapshot details.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshotDetails")
        private java.util.List<SnapshotDetail> threadSnapshotDetails;

        /**
         * Snapshot details.
         *
         * @param threadSnapshotDetails the value to set
         * @return this builder
         **/
        public Builder threadSnapshotDetails(java.util.List<SnapshotDetail> threadSnapshotDetails) {
            this.threadSnapshotDetails = threadSnapshotDetails;
            this.__explicitlySet__.add("threadSnapshotDetails");
            return this;
        }
        /**
         * Stack trace.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stackTrace")
        private java.util.List<StackTraceElement> stackTrace;

        /**
         * Stack trace.
         *
         * @param stackTrace the value to set
         * @return this builder
         **/
        public Builder stackTrace(java.util.List<StackTraceElement> stackTrace) {
            this.stackTrace = stackTrace;
            this.__explicitlySet__.add("stackTrace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThreadSnapshot build() {
            ThreadSnapshot model =
                    new ThreadSnapshot(this.timeStamp, this.threadSnapshotDetails, this.stackTrace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThreadSnapshot model) {
            if (model.wasPropertyExplicitlySet("timeStamp")) {
                this.timeStamp(model.getTimeStamp());
            }
            if (model.wasPropertyExplicitlySet("threadSnapshotDetails")) {
                this.threadSnapshotDetails(model.getThreadSnapshotDetails());
            }
            if (model.wasPropertyExplicitlySet("stackTrace")) {
                this.stackTrace(model.getStackTrace());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Snapshot time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
    private final java.util.Date timeStamp;

    /**
     * Snapshot time.
     *
     * @return the value
     **/
    public java.util.Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * Snapshot details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threadSnapshotDetails")
    private final java.util.List<SnapshotDetail> threadSnapshotDetails;

    /**
     * Snapshot details.
     *
     * @return the value
     **/
    public java.util.List<SnapshotDetail> getThreadSnapshotDetails() {
        return threadSnapshotDetails;
    }

    /**
     * Stack trace.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackTrace")
    private final java.util.List<StackTraceElement> stackTrace;

    /**
     * Stack trace.
     *
     * @return the value
     **/
    public java.util.List<StackTraceElement> getStackTrace() {
        return stackTrace;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ThreadSnapshot(");
        sb.append("super=").append(super.toString());
        sb.append("timeStamp=").append(String.valueOf(this.timeStamp));
        sb.append(", threadSnapshotDetails=").append(String.valueOf(this.threadSnapshotDetails));
        sb.append(", stackTrace=").append(String.valueOf(this.stackTrace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThreadSnapshot)) {
            return false;
        }

        ThreadSnapshot other = (ThreadSnapshot) o;
        return java.util.Objects.equals(this.timeStamp, other.timeStamp)
                && java.util.Objects.equals(this.threadSnapshotDetails, other.threadSnapshotDetails)
                && java.util.Objects.equals(this.stackTrace, other.stackTrace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeStamp == null ? 43 : this.timeStamp.hashCode());
        result =
                (result * PRIME)
                        + (this.threadSnapshotDetails == null
                                ? 43
                                : this.threadSnapshotDetails.hashCode());
        result = (result * PRIME) + (this.stackTrace == null ? 43 : this.stackTrace.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
