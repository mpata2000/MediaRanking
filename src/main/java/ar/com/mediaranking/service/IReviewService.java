package ar.com.mediaranking.service;

import ar.com.mediaranking.models.entity.ReviewEntity;
import ar.com.mediaranking.models.request.ReviewRequest;
import ar.com.mediaranking.models.response.ReviewResponse;

public interface IReviewService {
    ReviewEntity save(ReviewRequest reviewRequest);
}
