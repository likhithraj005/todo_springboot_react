import React from 'react'
import TodoCard from './TodoCard'

export default function TodoList(props) {
    // let todos = [
    //     "Go to the GYM",
    //     "Eat more fruits and veges",
    //     "Pick up kids from school"
    // ]

    const {todos} = props

    return (
        <ul className='main'>
            {todos.map((todo, todoIndex) => {
                return(
                    <TodoCard {...props} key={todoIndex} index={todoIndex}>
                        <p>{todo}</p>
                    </TodoCard>
                )
            })}
        </ul>
    )
}
