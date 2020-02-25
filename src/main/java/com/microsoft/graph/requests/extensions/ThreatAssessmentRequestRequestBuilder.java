// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IThreatAssessmentRequestRequest;
import com.microsoft.graph.requests.extensions.ThreatAssessmentRequestRequest;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IThreatAssessmentResultRequestBuilder;
import com.microsoft.graph.requests.extensions.ThreatAssessmentResultRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Request Request Builder.
 */
public class ThreatAssessmentRequestRequestBuilder extends BaseRequestBuilder implements IThreatAssessmentRequestRequestBuilder {

    /**
     * The request builder for the ThreatAssessmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentRequestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IThreatAssessmentRequestRequest instance
     */
    public IThreatAssessmentRequestRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IThreatAssessmentRequestRequest instance
     */
    public IThreatAssessmentRequestRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ThreatAssessmentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IThreatAssessmentResultCollectionRequestBuilder results() {
        return new ThreatAssessmentResultCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("results"), getClient(), null);
    }

    public IThreatAssessmentResultRequestBuilder results(final String id) {
        return new ThreatAssessmentResultRequestBuilder(getRequestUrlWithAdditionalSegment("results") + "/" + id, getClient(), null);
    }
}

