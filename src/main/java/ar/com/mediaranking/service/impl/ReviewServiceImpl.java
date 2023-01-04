package ar.com.mediaranking.service.impl;

import ar.com.mediaranking.models.entity.ReviewEntity;
import ar.com.mediaranking.models.repository.IReviewRepository;
import ar.com.mediaranking.models.request.ReviewRequest;
import ar.com.mediaranking.models.response.ReviewResponse;
import ar.com.mediaranking.service.IReviewService;
import ar.com.mediaranking.utils.DtoToEntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements IReviewService {

    @Autowired
    private IReviewRepository repository;
    @Autowired
    private DtoToEntityConverter mapper;

    @Override
    public ReviewEntity save(ReviewRequest reviewRequest) {
        ReviewEntity entitySaved = mapper.convertDtoToEntity(reviewRequest);
        return repository.save(entitySaved);
    }}
