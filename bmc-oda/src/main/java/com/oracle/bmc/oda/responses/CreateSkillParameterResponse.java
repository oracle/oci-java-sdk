/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateSkillParameterResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Fully qualified URL for the newly created resource.
     */
    private String location;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * The returned SkillParameter instance.
     */
    private com.oracle.bmc.oda.model.SkillParameter skillParameter;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "location",
        "opcRequestId",
        "etag",
        "skillParameter"
    })
    private CreateSkillParameterResponse(
            int __httpStatusCode__,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.oda.model.SkillParameter skillParameter) {
        super(__httpStatusCode__);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.skillParameter = skillParameter;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSkillParameterResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            skillParameter(o.getSkillParameter());

            return this;
        }

        public CreateSkillParameterResponse build() {
            return new CreateSkillParameterResponse(
                    __httpStatusCode__, location, opcRequestId, etag, skillParameter);
        }
    }
}
