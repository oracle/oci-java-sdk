/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Data to download one-off patch. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DownloadOneoffPatch.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DownloadOneoffPatch
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"accessUri", "timeCreated", "timeExpires"})
    public DownloadOneoffPatch(
            String accessUri, java.util.Date timeCreated, java.util.Date timeExpires) {
        super();
        this.accessUri = accessUri;
        this.timeCreated = timeCreated;
        this.timeExpires = timeExpires;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** URI to download one-off patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessUri")
        private String accessUri;

        /**
         * URI to download one-off patch.
         *
         * @param accessUri the value to set
         * @return this builder
         */
        public Builder accessUri(String accessUri) {
            this.accessUri = accessUri;
            this.__explicitlySet__.add("accessUri");
            return this;
        }
        /** The date and time one-off patch URI was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time one-off patch URI was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time until which the one-off patch URI will be available for download. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
        private java.util.Date timeExpires;

        /**
         * The date and time until which the one-off patch URI will be available for download.
         *
         * @param timeExpires the value to set
         * @return this builder
         */
        public Builder timeExpires(java.util.Date timeExpires) {
            this.timeExpires = timeExpires;
            this.__explicitlySet__.add("timeExpires");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadOneoffPatch build() {
            DownloadOneoffPatch model =
                    new DownloadOneoffPatch(this.accessUri, this.timeCreated, this.timeExpires);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadOneoffPatch model) {
            if (model.wasPropertyExplicitlySet("accessUri")) {
                this.accessUri(model.getAccessUri());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeExpires")) {
                this.timeExpires(model.getTimeExpires());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** URI to download one-off patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessUri")
    private final String accessUri;

    /**
     * URI to download one-off patch.
     *
     * @return the value
     */
    public String getAccessUri() {
        return accessUri;
    }

    /** The date and time one-off patch URI was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time one-off patch URI was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time until which the one-off patch URI will be available for download. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpires")
    private final java.util.Date timeExpires;

    /**
     * The date and time until which the one-off patch URI will be available for download.
     *
     * @return the value
     */
    public java.util.Date getTimeExpires() {
        return timeExpires;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DownloadOneoffPatch(");
        sb.append("super=").append(super.toString());
        sb.append("accessUri=").append(String.valueOf(this.accessUri));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeExpires=").append(String.valueOf(this.timeExpires));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadOneoffPatch)) {
            return false;
        }

        DownloadOneoffPatch other = (DownloadOneoffPatch) o;
        return java.util.Objects.equals(this.accessUri, other.accessUri)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeExpires, other.timeExpires)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.accessUri == null ? 43 : this.accessUri.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeExpires == null ? 43 : this.timeExpires.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
