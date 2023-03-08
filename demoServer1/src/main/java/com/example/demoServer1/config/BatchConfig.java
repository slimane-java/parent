package com.example.demoServer1.config;

import com.example.demoServer1.entity.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
@EnableBatchProcessing
public class BatchConfig {

    private final JobBuilder jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<Invoice> reader(){
//        return new FlatFileItemReaderBuilder().name("invoiceItemesReader")
//                .resource(new ClassPathResource("inpute.csv"))
//                .delimited()
//                .names(new String[] {"idClient", "idOrder", "status"})
//                .fieldSetMapper(new BeanWrapperFieldSetMapper(){{
//                    setTargetType(Invoice.class);
//                }}).build();
        System.out.println("reader reader ");
        return null;
    }

    @Bean
    public JdbcBatchItemWriter writer(DataSource dataSource){
        System.out.println("writer writer");
//        System.out.println("datasourece" + dataSource.toString());
        return null;
    }

    public Job importeUserJob(){
        jobBuilderFactory.get
    }


}
