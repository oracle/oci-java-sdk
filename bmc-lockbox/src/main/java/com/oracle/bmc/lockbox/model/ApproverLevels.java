/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * The approver levels. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApproverLevels.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApproverLevels
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"level1", "level2", "level3"})
    public ApproverLevels(ApproverInfo level1, ApproverInfo level2, ApproverInfo level3) {
        super();
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("level1")
        private ApproverInfo level1;

        public Builder level1(ApproverInfo level1) {
            this.level1 = level1;
            this.__explicitlySet__.add("level1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("level2")
        private ApproverInfo level2;

        public Builder level2(ApproverInfo level2) {
            this.level2 = level2;
            this.__explicitlySet__.add("level2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("level3")
        private ApproverInfo level3;

        public Builder level3(ApproverInfo level3) {
            this.level3 = level3;
            this.__explicitlySet__.add("level3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproverLevels build() {
            ApproverLevels model = new ApproverLevels(this.level1, this.level2, this.level3);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproverLevels model) {
            if (model.wasPropertyExplicitlySet("level1")) {
                this.level1(model.getLevel1());
            }
            if (model.wasPropertyExplicitlySet("level2")) {
                this.level2(model.getLevel2());
            }
            if (model.wasPropertyExplicitlySet("level3")) {
                this.level3(model.getLevel3());
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

    @com.fasterxml.jackson.annotation.JsonProperty("level1")
    private final ApproverInfo level1;

    public ApproverInfo getLevel1() {
        return level1;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("level2")
    private final ApproverInfo level2;

    public ApproverInfo getLevel2() {
        return level2;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("level3")
    private final ApproverInfo level3;

    public ApproverInfo getLevel3() {
        return level3;
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
        sb.append("ApproverLevels(");
        sb.append("super=").append(super.toString());
        sb.append("level1=").append(String.valueOf(this.level1));
        sb.append(", level2=").append(String.valueOf(this.level2));
        sb.append(", level3=").append(String.valueOf(this.level3));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproverLevels)) {
            return false;
        }

        ApproverLevels other = (ApproverLevels) o;
        return java.util.Objects.equals(this.level1, other.level1)
                && java.util.Objects.equals(this.level2, other.level2)
                && java.util.Objects.equals(this.level3, other.level3)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level1 == null ? 43 : this.level1.hashCode());
        result = (result * PRIME) + (this.level2 == null ? 43 : this.level2.hashCode());
        result = (result * PRIME) + (this.level3 == null ? 43 : this.level3.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
