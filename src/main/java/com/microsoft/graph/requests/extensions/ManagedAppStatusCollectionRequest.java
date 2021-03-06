// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Status Collection Request.
 */
public class ManagedAppStatusCollectionRequest extends BaseCollectionRequest<ManagedAppStatusCollectionResponse, IManagedAppStatusCollectionPage> implements IManagedAppStatusCollectionRequest {

    /**
     * The request builder for this collection of ManagedAppStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppStatusCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppStatusCollectionResponse.class, IManagedAppStatusCollectionPage.class);
    }

    public void get(final ICallback<IManagedAppStatusCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IManagedAppStatusCollectionPage get() throws ClientException {
        final ManagedAppStatusCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagedAppStatus newManagedAppStatus, final ICallback<ManagedAppStatus> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagedAppStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagedAppStatus, callback);
    }

    public ManagedAppStatus post(final ManagedAppStatus newManagedAppStatus) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagedAppStatusRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagedAppStatus);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedAppStatusCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagedAppStatusCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedAppStatusCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagedAppStatusCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedAppStatusCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagedAppStatusCollectionRequest)this;
    }

    public IManagedAppStatusCollectionPage buildFromResponse(final ManagedAppStatusCollectionResponse response) {
        final IManagedAppStatusCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagedAppStatusCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagedAppStatusCollectionPage page = new ManagedAppStatusCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
