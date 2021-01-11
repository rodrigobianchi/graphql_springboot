package io.github.bianchi.input;

import graphql.schema.GraphQLInputType;
import io.github.bianchi.model.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInput implements GraphQLInputType {

    @Override
    public String getName() {
        return name;
    }

    private String name;
    private Integer age;
    private Gender gender;
}
