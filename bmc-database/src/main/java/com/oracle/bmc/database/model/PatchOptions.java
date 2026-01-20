/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Options for DB Home and Database patching <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchOptions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldSkipDataPatch", "shouldSkipClosedPdbs"})
    public PatchOptions(Boolean shouldSkipDataPatch, Boolean shouldSkipClosedPdbs) {
        super();
        this.shouldSkipDataPatch = shouldSkipDataPatch;
        this.shouldSkipClosedPdbs = shouldSkipClosedPdbs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Skip running datapatch on database(s) */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipDataPatch")
        private Boolean shouldSkipDataPatch;

        /**
         * Skip running datapatch on database(s)
         *
         * @param shouldSkipDataPatch the value to set
         * @return this builder
         */
        public Builder shouldSkipDataPatch(Boolean shouldSkipDataPatch) {
            this.shouldSkipDataPatch = shouldSkipDataPatch;
            this.__explicitlySet__.add("shouldSkipDataPatch");
            return this;
        }
        /** Skip running datapatch on PDBs in closed state */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipClosedPdbs")
        private Boolean shouldSkipClosedPdbs;

        /**
         * Skip running datapatch on PDBs in closed state
         *
         * @param shouldSkipClosedPdbs the value to set
         * @return this builder
         */
        public Builder shouldSkipClosedPdbs(Boolean shouldSkipClosedPdbs) {
            this.shouldSkipClosedPdbs = shouldSkipClosedPdbs;
            this.__explicitlySet__.add("shouldSkipClosedPdbs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchOptions build() {
            PatchOptions model =
                    new PatchOptions(this.shouldSkipDataPatch, this.shouldSkipClosedPdbs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchOptions model) {
            if (model.wasPropertyExplicitlySet("shouldSkipDataPatch")) {
                this.shouldSkipDataPatch(model.getShouldSkipDataPatch());
            }
            if (model.wasPropertyExplicitlySet("shouldSkipClosedPdbs")) {
                this.shouldSkipClosedPdbs(model.getShouldSkipClosedPdbs());
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

    /** Skip running datapatch on database(s) */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipDataPatch")
    private final Boolean shouldSkipDataPatch;

    /**
     * Skip running datapatch on database(s)
     *
     * @return the value
     */
    public Boolean getShouldSkipDataPatch() {
        return shouldSkipDataPatch;
    }

    /** Skip running datapatch on PDBs in closed state */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldSkipClosedPdbs")
    private final Boolean shouldSkipClosedPdbs;

    /**
     * Skip running datapatch on PDBs in closed state
     *
     * @return the value
     */
    public Boolean getShouldSkipClosedPdbs() {
        return shouldSkipClosedPdbs;
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
        sb.append("PatchOptions(");
        sb.append("super=").append(super.toString());
        sb.append("shouldSkipDataPatch=").append(String.valueOf(this.shouldSkipDataPatch));
        sb.append(", shouldSkipClosedPdbs=").append(String.valueOf(this.shouldSkipClosedPdbs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchOptions)) {
            return false;
        }

        PatchOptions other = (PatchOptions) o;
        return java.util.Objects.equals(this.shouldSkipDataPatch, other.shouldSkipDataPatch)
                && java.util.Objects.equals(this.shouldSkipClosedPdbs, other.shouldSkipClosedPdbs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldSkipDataPatch == null
                                ? 43
                                : this.shouldSkipDataPatch.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldSkipClosedPdbs == null
                                ? 43
                                : this.shouldSkipClosedPdbs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
